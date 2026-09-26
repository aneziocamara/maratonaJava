/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.heranca.test;

import br.com.abc.javacore.heranca.classes.Enderesso;
import br.com.abc.javacore.heranca.classes.Funsionario;
import br.com.abc.javacore.heranca.classes.Phessoa;

/**
 *
 * @author anezi
 */
public class HerancaTeste {
     public static void main(String[] args) {
        Phessoa p = new Phessoa("Jesus");
        Enderesso end = new Enderesso();
        //p.setNome("");
        p.setCpf("123456");
        end.setRua("Avenida Brasil");
        end.setBairro("Pavuna/RJ");
        p.setEndereco(end);
        p.imprime();
         System.out.println("***************************************");
        Funsionario f = new Funsionario("Joao Batista");
        //f.setNome("");
        f.setCpf("1234567");
        f.setSalario(15000);
        f.setEndereco(end);
        f.imprime();
    }
}



















