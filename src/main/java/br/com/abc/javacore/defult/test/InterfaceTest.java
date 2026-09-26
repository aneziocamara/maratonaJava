/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.defult.test;

import br.com.abc.javacore.defult.interfaces.MyList;

/**
 *
 * @author Anezio
 */
public class InterfaceTest implements MyList {

    public static void main(String[] args) {
        MyList.sort();
        new InterfaceTest().remove();
        new InterfaceTest().add();
    }

    @Override
    public void add() {
        System.out.println("Dentro do add.");
    }

}
