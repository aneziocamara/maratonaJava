/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.introducao.controleDeFluxo;

/**
 *
 * @author anezi
 */
public class ControleDeFluxo1 {

    public static void main(String[] args) {
        /*
        idade <= 15 (Infantil)
        idade >= 15 && idade < 18 (Juvenil)
        idade >= 18 (Adulto)
         */
        int idade = 18;
        //float salario = 2000;
        //boolean c = false;
        String categoria;
        if (idade <= 15) {
            categoria = "Infantil";
        } else if (idade > 15 && idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        System.out.println(categoria);

    }
}
