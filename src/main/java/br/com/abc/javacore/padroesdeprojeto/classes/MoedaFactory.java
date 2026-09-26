/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.padroesdeprojeto.classes;

/**
 *
 * @author Anezio
 */
public class MoedaFactory {

    public static Moeda criarMoeda(Pais pais) {
        if (pais.equals(Pais.BRASIL)) {
            return new Real();
        } else if (pais.equals(Pais.EUA)) {
            return new Dolar();
        }
        throw new IllegalArgumentException("Não existe esse pais.");
    }
}
