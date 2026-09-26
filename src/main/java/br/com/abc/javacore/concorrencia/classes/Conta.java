/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.concorrencia.classes;

import br.com.abc.javacore.threads.classes.*;

/**
 *
 * @author Anezio
 */
public class Conta {
    private int saldo = 50;
    
    public int getSaldo(){
        return saldo;
    }
    
    public void saque(int valor){
        saldo = saldo - valor;
    }
}
