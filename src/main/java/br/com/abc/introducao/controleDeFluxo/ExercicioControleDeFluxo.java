/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.introducao.controleDeFluxo;

/**
 *
 * @author anezi
 */
public class ExercicioControleDeFluxo {

    public static void main(String[] args) {
        /*
        Crie uma variavel salario e imprima seu imposto
        Imposto
        salario < 1000 5%
        salario >= 1000 && salario < 2000 10%
        salario >= 2000 && salario < 4000 15%
        salaro > 5000 20%
         */

        int salario = 3000;
        String imposto;
        imposto = salario < 1000 ? "5%" : salario >= 1000 && salario < 2000 ? "10%" : salario >= 2000 && salario < 4000 ? "15%" : salario > 5000 ? "20%" : "";
        System.out.println(imposto);
    }
}
