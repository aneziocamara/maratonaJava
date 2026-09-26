/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.classesinternas.test;

/**
 *
 * @author Anezio
 */
public class ClassesLocaisTest {

    private String nome = "Jesus, Rei de Nebadon!";

    public void FazAlgumaCoisa() {
        class Interna {

            public void imprimeNomeExterno() {
                System.out.println(nome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }

    public static void main(String[] args) {
        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.FazAlgumaCoisa();
    }
}
