/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.sobrescrita.test;

import br.com.abc.javacore.sobrescrita.classes.Pessoa;

/**
 *
 * @author anezi
 */
public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Bezerra de Menezes");
        p.setIdade(195);
        System.out.println(p);
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Emmanuel");
        p2.setIdade(2095);
        System.out.println(p2);
    }
   
}

