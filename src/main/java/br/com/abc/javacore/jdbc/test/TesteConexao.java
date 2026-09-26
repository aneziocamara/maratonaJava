/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.jdbc.test;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.conn.ConexaoFactory;
import br.com.abc.javacore.jdbc.db.CompradorDBOLD;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Anezio
 */
public class TesteConexao {

    public static void main(String[] args) throws SQLException {
//       deletar(); 
//        atualizar();
//        List<Comprador> listaComprador = selecionarTudo();
//        System.out.println(listaComprador);
//        List<Comprador> listaComprador2 = buscarPorNome("su");
//        System.out.println(listaComprador2);
//        CompradorDBOLD.selectMetaData();;
//        CompradorDBOLD.checkDriverStatus();
//        CompradorDBOLD.testTypeScroll();
//        CompradorDBOLD.updateNomesToLowerCase();
//        CompradorDBOLD.updateNomesToLowerCase2();
//        System.out.println(CompradorDBOLD.searchByNamePreparedStatement("em"));
//        CompradorDBOLD.updatePreareStatement(new Comprador(1, "444.555.666-77", "Ministro Clarêncio"));
//        System.out.println(CompradorDBOLD.searchByNameCallableStatement("tro"));
//        System.out.println(CompradorDBOLD.searchByNameRowSet("em"));
//        CompradorDBOLD.updatePreareStatement(new Comprador(1, "444.555.666-77", "Min. Clarêncio"));
//        CompradorDBOLD.updateRowSet(new Comprador(1,"001.011.012-01","Minstro Clarencio"));
//        CompradorDBOLD.updateRowSetCached(new Comprador(1, "001.011.012-01", "Minstro Clarencio"));
        CompradorDBOLD.saveTransaction();
    }

    public static void inserir() {
        Comprador comprador = new Comprador("123.456.789-12", "Cristo");
        CompradorDBOLD.save(comprador);
    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(Integer.SIZE);
        CompradorDBOLD.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(1, "000.000.000-14", "Jesus Cristos");
        CompradorDBOLD.update(comprador);
    }

    public static List<Comprador> selecionarTudo() {
        return CompradorDBOLD.selectAll();
    }

    public static List<Comprador> buscarPorNome(String nome) {
        return CompradorDBOLD.searchByName(nome);
    }
}
