/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.streams.test;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Anezio
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<List<String>> nomes = new ArrayList<>();
        nomes.add(asList("Jesus","Governador planetario"));
        nomes.add(asList("Cristo","Rei dos Reis"));
        List<String> collect = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);
        
        List<String> palavras = asList("Ola","Mestre");
        String[] split = palavras.get(0).split("");
        System.out.println(Arrays.toString(split));
        
        List<String[]> collect1 = palavras.stream().map(p -> p.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream(palavras.toArray(String[]::new));
        
        List<String> collect2 = palavras.stream() //  Stream<String>
                .map(p -> p.split(""))  //  Stream<String[]>
                .flatMap(Arrays::stream)  //  Stream<String>
                .collect(Collectors.toList());
        System.out.println(collect2);
    }
}
