/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.polimorfismo.test;

import br.com.abc.javacore.polimorfismo.classes.Gerente;
import br.com.abc.javacore.polimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.polimorfismo.classes.Vendedor;

/**
 *
 * @author Larissa
 */
public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Oswaldo",5000,2000);
        Vendedor v = new Vendedor("Yuri",2000,20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
        
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("---------------------------------");
//        relatorio.relatorioPagamentoVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("---------------------------------");
        relatorio.relatorioPagamentoGenerico(v);
        
    }
}
