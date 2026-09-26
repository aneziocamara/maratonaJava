/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Produto;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Larissa
 */
public class SetTest {

    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "notebook", 3000d, 10);
        Produto produto2 = new Produto("456", "coxao mole", 50d, 10);
        Produto produto3 = new Produto("789", "teclado", 20d, 0);
        Produto produto4 = new Produto("012", "acucar", 12d, 0);
        Produto produto5 = new Produto("999", "acucar mascavo", 14d, 5);
//        Set<Produto> produtoSet = new HashSet<>();
        Set<Produto> produtoSet = new LinkedHashSet<>();
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);
//        System.out.println(produtoSet);
        for(Produto p : produtoSet){
            System.out.println(p);
        }
    }

}
