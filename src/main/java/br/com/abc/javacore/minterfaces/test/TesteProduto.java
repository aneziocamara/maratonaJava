/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.minterfaces.test;

import br.com.abc.javacore.minterfaces.classes.Produto;

/**
 *
 * @author Larissa
 */
public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto("notebook",4,3000);
        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
