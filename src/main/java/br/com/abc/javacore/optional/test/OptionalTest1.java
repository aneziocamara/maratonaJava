/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.optional.test;

import java.util.Optional;

/**
 *
 * @author Anezio
 */
public class OptionalTest1 {

    private String nome;

    public static void main(String[] args) {
        OptionalTest1 ot = new OptionalTest1();
        Optional<String> optional1 = Optional.of("Jesus");
        Optional<String> optional2 = Optional.empty();
        Optional<String> optional3 = Optional.ofNullable(ot.nome);
//        Imprimindo
        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
//        Buscando valores
        System.out.println(optional1.orElse("vazio"));
        System.out.println(optional2.orElse("vazio"));
        System.out.println(optional3.orElse("vazio"));
        
//        System.out.println(ot.nome.toUpperCase());
    }
}
