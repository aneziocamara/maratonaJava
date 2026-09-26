/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.padroesdeprojeto.test;

import br.com.abc.javacore.padroesdeprojeto.classes.Pessoa;



/**
 *
 * @author Anezio
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("Jesus")
                .nomeDoMeio("Sananda")
                .ultimoNome("Cristo")
                .apelido("ReiDosReis")
                .nomeDoPai("Deus")
                .build();
        System.out.println(p);
    }
}