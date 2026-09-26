/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.introducao.controleDeFluxo;

/**
 *
 * @author anezi
 */
public class ControleDeFluxo2 {

    public static void main(String[] args) {
        int idade = 18;
        String status;
        /*
        if (idade < 18) {
            status = "Nao adulto";
        } else {
            status = "Adulto";
        }
         */
        status = idade < 18 ? "Nao Adulto" : "Adulto";
        System.out.println(status);
    }
}
