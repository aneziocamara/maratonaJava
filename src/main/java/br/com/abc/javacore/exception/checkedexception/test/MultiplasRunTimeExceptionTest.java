/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.exception.checkedexception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 *
 * @author anezi
 */
public class MultiplasRunTimeExceptionTest {

    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException.");

            System.out.println("Final do programa.");
        }
        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {

        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
