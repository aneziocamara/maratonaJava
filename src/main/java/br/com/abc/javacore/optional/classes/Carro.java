/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.optional.classes;

import java.util.Optional;

/**
 *
 * @author Anezio
 */
public class Carro {
    private Seguradora seguradora;
    private String nome;

    public Carro(Seguradora seguradora, String nome) {
        this.seguradora = seguradora;
        this.nome = nome;
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    public Optional<Seguradora> getSeguradora() {
        return Optional.ofNullable(seguradora);
    }

    public void setSeguradora(Seguradora seguradora) {
        this.seguradora = seguradora;
    }
    
    
}
