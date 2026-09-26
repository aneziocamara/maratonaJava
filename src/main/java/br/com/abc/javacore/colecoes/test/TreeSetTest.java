/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Produto;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author Larissa
 */
public class TreeSetTest {

    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "notebook", 3000d, 10);
        Produto produto2 = new Produto("456", "coxao mole", 50d, 10);
        Produto produto3 = new Produto("789", "teclado", 20d, 0);
        Produto produto4 = new Produto("012", "acucar", 12d, 0);
        Produto produto5 = new Produto("999", "acucar mascavo", 1d, 5);
        NavigableSet<Produto> produtoNavigableSet = new TreeSet();
        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);
        for (Produto produto : produtoNavigableSet.descendingSet()) {
            System.out.println(produto);
        }
        System.out.println("-------------------------");
//        lower <
//        floor <=
//        higher >
//        ceiling >=
        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollLast());
        System.out.println(produtoNavigableSet.size());
    }
}
