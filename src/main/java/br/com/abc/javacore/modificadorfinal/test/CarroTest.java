/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.modificadorfinal.test;

import br.com.abc.javacore.modificadorfinal.classes.Carro;

/**
 *
 * @author draro
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Lucano");
        System.out.println(c.getComprador());
    }
}
