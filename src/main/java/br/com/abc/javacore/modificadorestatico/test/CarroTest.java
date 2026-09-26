/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.modificadorestatico.test;

import br.com.abc.javacore.modificadorestatico.classes.Carro;

/**
 *
 * @author Rose
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Audi",275);
        Carro c3 = new Carro("Mercedes",290);
        
//        Carro.setVelocidadeLimite(220);
//        System.out.println(Carro.getVelocidadeLimite());
        
        c1.imprime();
        c2.imprime();
        c3.imprime();
        
        System.out.println("*************************");
        Carro.setVelocidadeLimite(220);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}


















