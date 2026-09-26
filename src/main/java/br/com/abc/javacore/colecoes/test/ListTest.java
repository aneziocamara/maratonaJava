/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Larissa
 */
public class ListTest {

    public static void main(String[] args) {
//        List<String> nomes = new ArrayList<>();
//        nomes.add("Jesus");
//        nomes.add("Cristo");
//        for (String nome : nomes) {
//            System.out.println(nome);
//        }
//        nomes.add("Chico");
//        for (String nome : nomes) {
//            System.out.println(nome);
//        }

        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Jesus");
        nomes.add("Cristo");
        nomes2.add("Jesus2");
        nomes2.add("Cristo2");
//        System.out.println("size: " + nomes.size());
//        System.out.println(nomes.remove("Cristo"));
//        System.out.println("size: " + nomes.size());
        nomes.clear();
        nomes.addAll(nomes2);
        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
            nomes.add("Xavier");
        }
//            System.out.println(nomes.get(2));
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        for (Integer num : numeros) {
            System.out.println(num);
        }
    }
}
