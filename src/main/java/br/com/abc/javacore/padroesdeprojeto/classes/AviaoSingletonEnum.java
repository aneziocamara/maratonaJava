/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.abc.javacore.padroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Anezio
 */
public enum AviaoSingletonEnum {
    INSTANCE;
    private Set<String> assentosDisponiveis;
    
    AviaoSingletonEnum() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }
    
    public boolean bookAssento(String assento) {
        return assentosDisponiveis.remove(assento);
    }
    
    public static void agendarAssento(String assento){
        AviaoSingletonEnum a = AviaoSingletonEnum.INSTANCE;
        System.out.println((boolean)a.bookAssento(assento));
    }
    
}
