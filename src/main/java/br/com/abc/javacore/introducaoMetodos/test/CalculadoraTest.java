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
public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisnumeros();
        calc.multiplicaDoisValores(5, 6);
        double result = calc.dividindoDoisValores(6, 3);
        System.out.println(result);
        System.out.println("Continuando a execucao!");
        
        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }
}
























