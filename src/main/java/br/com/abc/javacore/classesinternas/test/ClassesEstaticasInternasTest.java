/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.classesinternas.test;

/**
 *
 * @author Anezio
 */
class Externa{
    static class Interna{
        public void imprimir(){
            System.out.println("Oi!");
        }
    }
}

public class ClassesEstaticasInternasTest {
    public static void main(String[] args) {
        Externa.Interna teste = new Externa.Interna();
        teste.imprimir();
        Interna2 teste2 = new Interna2();
        teste2.imprimir();
    }
    static class Interna2{
        public void imprimir(){
            System.out.println("Oi dentro do Interna2!");
        }
    }
}
