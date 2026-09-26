/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.abc.javacore.defult.interfaces;

/**
 *
 * @author Anezio
 */
public interface MyList {

    static void sort() {
        System.out.println("Dentro do sort.");
    }

    void add();

    default void remove() {
        System.out.println("Dentro do remove.");
    }
}
