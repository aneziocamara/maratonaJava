/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.ggenerics.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Larissa
 */
public class MetodoGenericoTest {
    public static void main(String[] args) {
        criarArray(new Cachorro());
    }
    public static <T extends Animal> void criarArray(T t){
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }
}
