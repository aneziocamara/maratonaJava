/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.introducao.controleDeFluxo;

/**
 *
 * @author anezi
 */
public class ExercicioControleDeFluxo2_1 {

    public static void main(String[] args) {
        /*
        Crie uma variavel salario e imprima seu imposto
        Imposto
        salario < 1000 5%
        salario >= 1000 && salario < 2000 10%
        salario >= 2000 && salario < 4000 15%
        salaro > 5000 20%
         */

        double salario = 30000;
        double imposto = 0;
        if (salario < 1000) {
            imposto = salario * 0.05;
        } else if (salario >= 1000 && salario < 2000) {
            imposto = salario * 0.1;
        } else if (salario >= 2000 && salario < 4000) {
            imposto = salario * 0.15;
        } else if (salario > 5000) {
            imposto = salario * 0.2;
        }
        System.out.printf("Imposto devido: R$ %.2f\n",imposto);
    }
}
