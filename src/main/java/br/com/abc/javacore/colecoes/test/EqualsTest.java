/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Celular;

/**
 *
 * @author Larissa
 */
public class EqualsTest {
    public static void main(String[] args) {
        String nome1 = "Jesus Cristo";
        String nome2 = new String("Jesus Cristo");
        Integer num1 = 5;
        Integer num2 = new Integer(5);
        System.out.println(nome1 == nome2);
        System.out.println(num1 == num2);
        System.out.println("---------------------------");
        System.out.println(nome1.equals(nome2));
        System.out.println(num1.equals(num2));
        System.out.println("---------------------------");
        Celular c1 = new Celular("IPhone","1234");
        Celular c2 = new Celular("IPhone","1234");
        System.out.println(c1.equals(c2));
    }
}
