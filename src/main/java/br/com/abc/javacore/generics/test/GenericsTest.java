/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Larissa
 */
public class GenericsTest {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("String");
        lista.add("String");
        lista.add("Jesus Cristo");
        
        for(String obj : lista){
            System.out.println(obj);
        }
        add(lista,1L);
    }
    public static void add(List lista, Long L){
        lista.add(L);
    }
}
