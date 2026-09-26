/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.introducaoMetodos.test;

import br.com.abc.javacore.introducaoMetodos.classes.Professor;

/**
 *
 * @author anezi
 */
public class ProfessorTest {

    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "223.658.924-49";
        prof.matricula = "1112";
        prof.nome = "Euripedes";
        prof.rg = 167213;

        Professor prof2 = new Professor();
        prof2.cpf = "734.874.174-87";
        prof2.matricula = "6984";
        prof2.nome = "Barsanulfo";
        prof2.rg = 548023;

        prof.imprime();       
        prof2.imprime();

    }
}





















