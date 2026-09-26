/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.checkedexception.classes;

/**
 *
 * @author anezi
 */
public class Leitor2 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 2.");
    }
    
}
