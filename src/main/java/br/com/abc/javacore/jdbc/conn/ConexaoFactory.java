/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author Anezio
 */
public class ConexaoFactory {
//    java.sql = Connection, Statement, ResultSet
//    DriverManager
    public static Connection getConexao(){
        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "123";
        try {
//            DriverManager.getConnection(url, user, password).setAutoCommit(false);
//            Class.forName("com.mysql.jdbc.Drive");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static JdbcRowSet getRowSetConnection(){
        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "123";
        try {
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(password);
            return jdbcRowSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static CachedRowSet getRowSetConnectionCached(){
        String url = "jdbc:mysql://localhost:3306/agencia?relaxAutoCommit=true";
        String user = "root";
        String password = "123";
        try {
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setUrl(url);
            cachedRowSet.setUsername(user);
            cachedRowSet.setPassword(password);
            return cachedRowSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void close(Connection connection){
        try {
            if(connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void close(RowSet jrs){
        try {
            if(jrs != null)
                jrs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close(Connection connection, Statement stat){
        close(connection);
        try {
            if(stat != null)
                stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }  
    public static void close(Connection connection, Statement stat, ResultSet rs){
        close(connection, stat);
        try {
            if(rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }  
}
