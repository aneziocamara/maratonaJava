/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.classesinternas.test;

import br.com.abc.javacore.ggenerics.classes.Carro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Anezio
 */
class Animal {

    public void andar() {
        System.out.println("Andando!");
    }
}

public class ClassesAnonimasTest {

    public static void main(String[] args) {
        Animal a = new Animal() {
            public void andar() {
                System.out.println("Andando anonimamente!");
            }
        };
        a.andar();

        List<Carro> carroList = new ArrayList<>();
        carroList.add(new Carro("BMW"));
        carroList.add(new Carro("Audi"));
        Collections.sort(carroList, new Comparator<Carro>() {
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(carroList);
    }
}

//class CarroComparator implements Comparator<Carro> {
//
//    @Override
//    public int compare(Carro o1, Carro o2) {
//        return o1.getNome().compareTo(o2.getNome());
//    }
//
//}
