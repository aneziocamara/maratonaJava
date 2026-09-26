/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.abc.javacore.padroesdeprojeto.classes;

/**
 *
 * @author Anezio
 */
public interface Moeda {

    String getSimbolo();
}

class Real implements Moeda {

    @Override
    public String getSimbolo() {
        return "R$";
    }

}

class Dolar implements Moeda {

    @Override
    public String getSimbolo() {
        return "USD";
    }


}
