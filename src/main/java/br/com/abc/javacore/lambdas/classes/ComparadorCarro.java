/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.lambdas.classes;

/**
 *
 * @author Anezio
 */
public class ComparadorCarro {
    public static int comparePorCor(Carro c1, Carro c2){
        return c1.getCor().compareTo(c2.getCor());
    }
    
    public int comparePorAno(Carro c1, Carro c2){
        return ((Integer)c1.getAno()).compareTo(c2.getAno());
    }
}
