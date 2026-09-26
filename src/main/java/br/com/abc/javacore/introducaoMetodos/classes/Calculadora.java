/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.introducaoMetodos.classes;

/**
 *
 * @author anezi
 */
public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisnumeros() {
        System.out.println(6 - 5);
    }

    public void multiplicaDoisValores(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividindoDoisValores(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimindoDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Nao eh possivel dividir por 0!");
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera dois numeros!");
        System.out.println("nmu1 = " + num1);
        System.out.println("nmu2 = " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("A soma eh: " + soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
            System.out.println("A soma VarArgs eh: " + soma);
        }
    }

}
