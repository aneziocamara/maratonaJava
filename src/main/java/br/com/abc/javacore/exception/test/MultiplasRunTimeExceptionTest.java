/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.exception.test;

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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException.");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException.");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException.");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException.");
        }
        System.out.println("Final do programa.");

        try {
            talvezLanceException();
        } catch (SQLException e) {

        } catch (FileNotFoundException e) {

        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {
        
    }
}
