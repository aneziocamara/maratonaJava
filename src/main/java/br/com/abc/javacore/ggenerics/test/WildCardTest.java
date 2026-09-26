/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.ggenerics.test;

import br.com.abc.javacore.generics.test.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Larissa
 */
abstract class Animal {

    public abstract void consulta();
}

class Cachorro extends Animal implements Comparable {

    @Override
    public void consulta() {
        System.out.println("Consultando cachorro.");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando gato.");
    }
}

public class WildCardTest {

    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        consultarAnimais(cachorros);
//        consultarAnimais(gatos);
        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());
        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());
//        consultarAnimaisList(cachorroList);
        List<Animal> animalList = new ArrayList<>();
        consultarAnimaisList(animalList);
        ordenarLista(cachorroList);
    }

    public static void consultarAnimais(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals[1] = new Gato();
    }
//type erasure | ?(caracter coringa)
    public static void consultarAnimaisList(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
       }              
    }
    public static void consultarCachorrosList(List<? super Cachorro> cachorroList) {
        Cachorro c1 = new Cachorro();              
        Animal c2 = new Cachorro();
        Object o = new Cachorro();
        cachorroList.add(new Cachorro());   
    }
    public static void ordenarLista(List<? extends Comparable> lista){
        Collections.sort(lista);
    }
}
