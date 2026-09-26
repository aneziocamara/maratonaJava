/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Produto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Larissa
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
//        (-(ponto de insercao)-1)
        Collections.sort(numeros);
//0,1,2,3
//0,2,3,4
        System.out.println(Collections.binarySearch(numeros, 1));

        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123", "notebook", 3000d);
        Produto produto2 = new Produto("456", "coxao mole", 50d);
        Produto produto3 = new Produto("789", "teclado", 20d);
        Produto produto4 = new Produto("012", "acucar", 12d);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Collections.sort(produtos, new ProdutoNomeComparator());
        Produto produto5 = new Produto("000", "antena", 50d);
        for(Produto produto : produtos)
        {
            System.out.println(produto);
        }
        System.out.println(Collections.binarySearch(produtos, produto5, new ProdutoNomeComparator()));
        Integer[] arrayInteger = new Integer[4];
        arrayInteger[0] = 2;
        arrayInteger[1] = 0;
        arrayInteger[2] = 4;
        arrayInteger[3] = 3;
        Arrays.sort(arrayInteger);
        System.out.println(Arrays.binarySearch(arrayInteger, 1));
        
    }
}
