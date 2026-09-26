/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.introducao.controleDeFluxo;

/**
 *
 * @author anezi
 */
public class ControleDeFluxo2_1 {

    public static void main(String[] args) {
        /*
        idade < 15 (Infantil)
        idade >= 15 && idade < 18 (Juvenil)
        idade >= 18 (Adulto)
         */
        int idade = 16;
        String status;
        status = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "Juvenil" : "Adulto";
        System.out.println(status);
    }
}
