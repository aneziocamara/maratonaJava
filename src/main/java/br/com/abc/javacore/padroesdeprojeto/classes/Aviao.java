/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.padroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Anezio
 */
public class Aviao {
    private Set<String> assentosDisponiveis;

    public Aviao() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }
    
    public boolean bookAssento(String assento){
        return assentosDisponiveis.remove(assento);
    }
}
