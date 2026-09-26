/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Produto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Larissa
 */
public class IteratorTest {
    public static void main(String[] args) {
        
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123", "notebook", 3000d,0);
        Produto produto2 = new Produto("456", "coxao mole", 50d,10);
        Produto produto3 = new Produto("789", "teclado", 20d,5);
        Produto produto4 = new Produto("012", "acucar", 12d,0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        
        Iterator<Produto> produtoIterator = produtos.iterator();
        while(produtoIterator.hasNext()){
            if(produtoIterator.next().getQuantidade() == 0){
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());
//        System.out.println(produtos.size());
//        
//        for(Produto produto : produtos){
//            if(produto.getQuantidade() == 0){
//                produtos.remove(produto);
//            }
//        }
//        System.out.println(produtos.size());
    }
}
