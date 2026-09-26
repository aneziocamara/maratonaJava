/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.introducao.controleDeFluxo;

/**
 *
 * @author anezi
 */
public class ExercicioControleDeFluxo2_2 {

    public static void main(String[] args) {
        /*
        Crie uma variavel salario e imprima seu imposto
        Imposto
        salario < 1000 5%
        salario >= 1000 && salario < 2000 10%
        salario >= 2000 && salario < 4000 15%
        salaro > 5000 20%
         */

        int salario = 100;
        String imposto = "";
        if (salario < 1000) {
            imposto = "5%";
        } else if (salario >= 1000 && salario < 2000) {
            imposto = "10%";
        } else if (salario >= 2000 && salario < 4000) {
            imposto = "15%";
        } else if (salario > 5000) {
            imposto = "20%";
        }
        System.out.println("Imposto devido: " + imposto);
    }
}
