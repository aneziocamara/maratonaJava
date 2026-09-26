/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Produto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Larissa
 */
class ProdutoNomeComparator implements Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
    
} 
public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto[] produtosArray = new Produto[4];
        
        
        Produto produto1 = new Produto("123", "notebook", 3000d);
        Produto produto2 = new Produto("456", "coxao mole", 50d);
        Produto produto3 = new Produto("789", "teclado", 20d);
        Produto produto4 = new Produto("012", "acucar", 12d);
        
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        
        produtosArray[0] = produto1;
        produtosArray[1] = produto2;
        produtosArray[2] = produto3;
        produtosArray[3] = produto4;
        
        Collections.sort(produtos, new ProdutoNomeComparator());
        
//        for(Produto produto : produtos){
//            System.out.println(produto);
//        }

        Arrays.sort(produtosArray, new ProdutoNomeComparator());
        for (Produto produto : produtosArray) {
            System.out.println(produto);
        }
    }
}
