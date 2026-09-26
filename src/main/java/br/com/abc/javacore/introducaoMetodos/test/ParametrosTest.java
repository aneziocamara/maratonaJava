/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.introducaoMetodos.test;

import br.com.abc.javacore.introducaoMetodos.classes.Calculadora;

/**
 *
 * @author anezi
 */
public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do teste!");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
}
























