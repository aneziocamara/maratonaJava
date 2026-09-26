/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.concorrencia.test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 *
 * @author Anezio
 */
public class ConcorrenciaDeColecoesTest {
    public static void main(String[] args) {
//        ConcurrentHashMap
//        ConcurrentLinkedDeque
//        ConcurrentLinkedQueue
//        ConcurrentSkipListMap
//        ConcurrentSkipListSet
        
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "1");
        map.putIfAbsent("1", "2");
        System.out.println(map.get("1"));
    }
}
