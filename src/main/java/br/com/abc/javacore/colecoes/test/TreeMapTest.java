/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Consumidor;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author Larissa
 */
public class TreeMapTest {

    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println(map.headMap("C", true));
        System.out.println(map.higherEntry("C"));
        System.out.println(map.descendingMap());
        
        System.out.println("--------------------------------------");
        
        NavigableMap<String, Consumidor> map2 = new TreeMap<>();
        Consumidor consumidor = new Consumidor("Jesus Cristo","122");
        Consumidor consumidor2 = new Consumidor("Tiago Apostolo","321");
        map2.put("D", consumidor2);
        map2.put("A", consumidor);
//        map.put("B", "Letra B");
//        map.put("C", "Letra C");

        for (Map.Entry<String, Consumidor> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        
    }
}
