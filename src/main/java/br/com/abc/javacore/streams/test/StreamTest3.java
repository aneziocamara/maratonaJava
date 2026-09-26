/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.streams.test;

import br.com.abc.javacore.streams.classes.Pessoa;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Anezio
 */
public class StreamTest3 {

    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        System.out.println((boolean) pessoas.stream().anyMatch(p -> p.getSalario() > 4000));
        System.out.println((boolean) pessoas.stream().allMatch(p -> p.getIdade()> 18));
        System.out.println((boolean) pessoas.stream().noneMatch(p -> p.getIdade()< 18));
        pessoas.stream()
                .filter(p->p.getIdade() < 25)
                .findAny()
                .ifPresent(p->System.out.println(p.getNome()));
        
        pessoas.stream()
                .filter(p->p.getIdade() > 30)
                .findFirst()
                .ifPresent(p->System.out.println(p.getNome()));
        
        pessoas.stream()
                .filter(p->p.getIdade() > 30)
                .sorted(Comparator.comparing(Pessoa::getIdade).reversed())
                .findFirst()
                .ifPresent(p->System.out.println(p.getNome()));
    }
}





