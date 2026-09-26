/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.introducaoClasses.test;

import br.com.abc.javacore.introducaoClasses.classes.Professor;

/**
 *
 * @author anezi
 */
public class ProfessorTest {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Andre Luiz";
        professor.matricula = "171835";
        professor.rg = 667932;
        professor.cpf = "423.890.064-79";

        System.out.println("Nome: " + professor.nome);
        System.out.println("Matricula: " + professor.matricula);
        System.out.println("Identidade: " + professor.rg);
        System.out.println("CPF: " + professor.cpf);
        
    }
}
