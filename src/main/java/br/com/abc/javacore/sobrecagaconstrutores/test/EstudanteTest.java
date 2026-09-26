/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.sobrecagaconstrutores.test;

import br.com.abc.javacore.sobrecagaconstrutores.classes.Estudante;

/**
 *
 * @author Larissa
 */
public class EstudanteTest {

    public static void main(String[] args) {
        Estudante est = new Estudante("Anezio", "1121", new double[]{5, 7, 9},"08Jan2023");
        est.imprime();
    }
}
