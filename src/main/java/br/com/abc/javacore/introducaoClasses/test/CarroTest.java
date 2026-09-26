/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.introducaoClasses.test;

import br.com.abc.javacore.introducaoClasses.classes.Carro;

/**
 *
 * @author anezi
 */
public class CarroTest {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.placa = "MXX0I68";
        carro.modelo = "Santana";
        carro.velocidadeMaxima = 220f;

        System.out.println(carro.placa);
        System.out.println(carro.modelo);
        System.out.println(carro.velocidadeMaxima+"Km");
    }

}
