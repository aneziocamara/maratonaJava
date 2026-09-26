/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.jdbc.db;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.classes.MyRowSetListener;
import br.com.abc.javacore.jdbc.conn.ConexaoFactory;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;

/**
 *
 * @author anezi
 */
public class CompradorDB {

    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador`(`cpf`,`nome`) VALUES ('" + comprador.getCpf() + "','" + comprador.getNome() + "');";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stat = conn.createStatement();
            System.out.println(stat.executeUpdate(sql));
            ConexaoFactory.close(conn, stat);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void saveTransaction() throws SQLException {
        String sql = "INSERT INTO `agencia`.`comprador`(`cpf`,`nome`) VALUES ('TESTE1','TESTE1')";
        String sql2 = "INSERT INTO `agencia`.`comprador`(`cpf`,`nome`) VALUES ('TESTE2','TESTE2')";
        String sql3 = "INSERT INTO `agencia`.`comprador`(`cpf`,`nome`) VALUES ('TESTE3','TESTE3')";
        Connection conn = ConexaoFactory.getConexao();
        Savepoint savepoint = null;
        try {
            conn.setAutoCommit(false);
            Statement stat = conn.createStatement();
            stat.executeUpdate(sql);
            savepoint = conn.setSavepoint("One");
            stat.executeUpdate(sql2);
            if(true)
                throw new SQLException();
            stat.executeUpdate(sql3);
            conn.commit();
            ConexaoFactory.close(conn, stat);
            System.out.println("Registro inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback(savepoint);
            conn.commit();
        }
    }

    public static void delete(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel excluir o registro!");
            return;
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE `id` =" + comprador.getId() + ";";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stat = conn.createStatement();
            stat.executeUpdate(sql);
            ConexaoFactory.close(conn, stat);
            System.out.println("Registro excluido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel atualizar o registro!");
            return;
        }
//        UPDATE `agencia`.`comprador` SET `cpf` = '123.345.567-70', `nome` = 'Jesus' WHERE (`id` = '1');
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = '" + comprador.getCpf() + "', `nome` = '" + comprador.getNome() + "' WHERE (`id` = '" + comprador.getId() + "');";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stat = conn.createStatement();
            stat.executeUpdate(sql);
            ConexaoFactory.close(conn, stat);
            System.out.println("Registro atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void updatePreareStatement(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel atualizar o registro!");
            return;
        }
//        UPDATE `agencia`.`comprador` SET `cpf` = '123.345.567-70', `nome` = 'Jesus' WHERE (`id` = '1');
//String sql = "UPDATE nome_da_tabela SET `coluna1` = ?, `nome` = ? WHERE `id` = ?";
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE `id` = ?";
        Connection conn = ConexaoFactory.getConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.setInt(3, comprador.getId());
            ps.executeUpdate();
            ConexaoFactory.close(conn, ps);
            System.out.println("Registro atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void updateRowSet(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel atualizar o registro!");
            return;
        }
        String sql = "SELECT * FROM `agencia`.`comprador` WHERE `id` = ?";
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        jrs.addRowSetListener(new MyRowSetListener());
        try {
            jrs.setCommand(sql);
//            jrs.setString(1, comprador.getCpf());
//            jrs.setString(2, comprador.getNome());
            jrs.setInt(1, comprador.getId());
            jrs.execute();
            jrs.next();
            jrs.updateString("nome", "Minstro Clarencio");
            jrs.updateRow();
            ConexaoFactory.close(jrs);
            System.out.println("Registro atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void updateRowSetCached(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel atualizar o registro!");
            return;
        }
        String sql = "SELECT * FROM `agencia`.`comprador` WHERE `id` = ?";
        CachedRowSet crs = ConexaoFactory.getRowSetConnectionCached();
        try {
            crs.setCommand(sql);
            crs.setInt(1, comprador.getId());
            crs.execute();
            crs.next();
            crs.setTableName("comprador");
            crs.updateString("nome", "Rosemeire Dias");
            crs.updateRow();
            Thread.sleep(8000);
            crs.acceptChanges();
            System.out.println("Registro atualizado com sucesso!");
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<Comprador> selectAll() {
        String sql = "SELECT id,cpf,nome FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, stat, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByName(String nome) {
        String sql = "SELECT id,cpf,nome FROM agencia.comprador where nome like '%" + nome + "%'";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, stat, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static List<Comprador> searchByNamePreparedStatement(String nome) {
        String sql = "SELECT id,cpf,nome FROM agencia.comprador where nome like ?";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%"+nome+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, ps, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static List<Comprador> searchByNameRowSet(String nome) {
        String sql = "SELECT id,cpf,nome FROM agencia.comprador where nome like ?";
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        jrs.addRowSetListener(new MyRowSetListener());
        List<Comprador> compradorList = new ArrayList<>();
        try {
            jrs.setCommand(sql);
            jrs.setString(1, "%"+nome+"%");
            jrs.execute();
            while (jrs.next()) {
                compradorList.add(new Comprador(jrs.getInt("id"), jrs.getString("cpf"), jrs.getString("nome")));
            }
            ConexaoFactory.close(jrs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static List<Comprador> searchByNameCallableStatement(String nome) {
        String sql = "CALL `agencia`.`SP_GetCompradoresPorNome`( ? )";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, "%"+nome+"%");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, cs, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void selectMetaData() {
        String sql = "SELECT * FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            int qtdColunas = rsmd.getColumnCount();
            System.out.println("Quantidade de colunas: " + qtdColunas);
            for (int i = 1; i <= qtdColunas; i++) {
                System.out.println("Tabela: " + rsmd.getTableName(i));
                System.out.println("Nome da coluna: " + rsmd.getColumnName(i));
                System.out.println("Tamanho da coluna: " + rsmd.getColumnDisplaySize(i));
            }
            ConexaoFactory.close(conn, stat, rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkDriverStatus() {
        Connection conn = ConexaoFactory.getConexao();
        try {
            DatabaseMetaData dbmd = conn.getMetaData();
            if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Suporta TYPE_FORWARD_ONLY");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e tambem suporta CONCUR_UPDATABLE.");
                }
            }
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e tambem suporta CONCUR_UPDATABLE.");
                }
            }
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e tambem suporta CONCUR_UPDATABLE.");
                }
            }
            ConexaoFactory.close(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testTypeScroll() {
        String sql = "SELECT id,cpf,nome FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stat = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
            ResultSet rs = stat.executeQuery(sql);
            if (rs.last()) {
                System.out.println("Ultima linha: "+new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
                System.out.println("Numero da ultima linha: "+rs.getRow());
            }
            System.out.println("Retornou para a primeira linha: "+rs.first());
            System.out.println("Primeira linha: "+rs.getRow());
            rs.absolute(4);
            System.out.println("Ultima linha: "+new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            rs.relative(-1);
            System.out.println("Ultima linha: "+new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            System.out.println(rs.isFirst());
            System.out.println((boolean)rs.isLast());
            rs.afterLast();
            System.out.println("----------------------------");
            while(rs.previous()){
                System.out.println(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            
            ConexaoFactory.close(conn, stat, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void updateNomesToLowerCase(){
        String sql = "SELECT id,cpf,nome FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
              rs.updateString("nome", rs.getString("nome").toLowerCase());
              rs.updateRow();
            }
            rs.beforeFirst();
            while(rs.next()){
                System.out.println(rs.getString("nome"));
        }
            ConexaoFactory.close(conn, stat, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void updateNomesToLowerCase2(){
        String sql = "SELECT id,cpf,nome FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();
        try {
            DatabaseMetaData dbmd = conn.getMetaData();
            
            Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stat.executeQuery(sql);
            System.out.println((boolean)dbmd.updatesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println((boolean)dbmd.insertsAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println((boolean)dbmd.deletesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            if (rs.next()) {
              rs.updateString("nome", rs.getString("nome").toUpperCase());
//rs.cancelRowUpdates();
              rs.updateRow();
//              if(rs.rowUpdated()){
//                  System.out.println("Linha atualizada.");
//              }
            }
            rs.absolute(2);
            String nome = rs.getString("nome");
            rs.moveToInsertRow();
            rs.updateString("nome", nome.toUpperCase());
            rs.updateString("cpf", "999.999.999-99");
            rs.insertRow();
            rs.moveToCurrentRow();
            System.out.println(rs.getString("nome")+" row "+rs.getRow());

            ConexaoFactory.close(conn, stat, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
