/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Larissa
 */
public class SortListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Jesus");
        nomes.add("Cristo");
        nomes.add("Maria");
        nomes.add("Santissima");
        nomes.add("Chico");
        nomes.add("Xavier");
        nomes.add(0, "Bezerra");
        Collections.sort(nomes);
        List<Double> numeros = new ArrayList<>();
        numeros.add(1.5);
        numeros.add(1.3);
        numeros.add(1.4);
        numeros.add(1.6);
        numeros.add(2d);
        Collections.sort(numeros);
        for(Double numero : numeros){
            System.out.println(numero);
        }
        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
