/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.introducaoMetodos.test;

import br.com.abc.javacore.introducaoMetodos.classes.Estudante;

/**
 *
 * @author anezi
 */
public class EstudanteTest {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Flavio");
        estudante.setIdade(-1);
        estudante.setNotas(new double[]{6, 6, 5});
        estudante.print();
        estudante.tirarMedia();
        System.out.println("Aprovado? "+estudante.isAprovado());
    }
}
