/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Consumidor;
import br.com.abc.javacore.colecoes.classes.Produto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author anezi
 */
public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Jesus Cristo","122");
        Consumidor consumidor2 = new Consumidor("Tiago Apostolo","321");
        Consumidor consumidor3 = new Consumidor("Barnabe","369");
        Produto produto1 = new Produto("123", "notebook", 3000d);
        Produto produto2 = new Produto("456", "coxao mole", 50d);
        Produto produto3 = new Produto("789", "teclado", 20d);
        Produto produto4 = new Produto("012", "acucar", 12d);
        
        Map<Consumidor,List<Produto>> map = new HashMap<>();
        List<Produto> produtosCom1 = new ArrayList<>();
        produtosCom1.add(produto1);
        produtosCom1.add(produto2);
        List<Produto> produtosCom2 = new ArrayList<>();
        produtosCom2.add(produto3);
        produtosCom2.add(produto4);
        
        map.put(consumidor, produtosCom1);
        map.put(consumidor2, produtosCom2);
        map.put(consumidor3, produtosCom1);
        for(Map.Entry<Consumidor,List<Produto>> entry : map.entrySet()){
            System.out.println(entry.getKey().getNome());
            for(Produto produto : entry.getValue()){
                System.out.println(produto.getNome());
            }
        }
        
        
//        Map<Consumidor,Produto> map = new HashMap<>();
//        map.put(consumidor, produto2);
//        map.put(consumidor2, produto4);
//        for(Map.Entry<Consumidor,Produto> entry : map.entrySet()){
//            System.out.println(entry.getKey().getNome()+" - "+entry.getValue().getNome());
//        }
    }
   
}
