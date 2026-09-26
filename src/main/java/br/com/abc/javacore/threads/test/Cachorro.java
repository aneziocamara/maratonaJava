/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.threads.test;

/**
 *
 * @author Anezio
 */
public class Cachorro {
    public static void main(String[] args) {
        Cachorro();
    }

    public static void Cachorro() {
        String latido = "Au, au!";
        System.out.println("Cachorro latindo:");
        for (int i = 0; i < 5; i++) {
            System.out.println(latido);   
        }
    }
}
