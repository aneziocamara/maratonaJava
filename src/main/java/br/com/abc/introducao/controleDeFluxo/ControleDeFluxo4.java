/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.introducao.controleDeFluxo;

/**
 *
 * @author anezi
 */
public class ControleDeFluxo4 {

    public static void main(String[] args) {

        int contador = 0;

        while (contador < 10) {
            System.out.println(++contador);
        }

        do {
            System.out.println(contador++);
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("O numero i eh: " + i);
        }

    }
}
