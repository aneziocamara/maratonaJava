/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.jdbc.test;

import br.com.abc.javacore.jdbc.conn.ConexaoFactory;

/**
 *
 * @author Anezio
 */
public class TestConexao {
    public static void main(String[] args) {
        ConexaoFactory conn = new ConexaoFactory();
        conn.getConexao();
    }
}
