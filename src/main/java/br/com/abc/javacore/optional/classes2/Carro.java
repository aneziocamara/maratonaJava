/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.optional.classes2;

/**
 *
 * @author Anezio
 */
public class Carro {
    private Seguradora seguradora;
    private String nome;

    public String getNomeSeguradora(Pessoa p){
        if (p != null) {
            Carro carro = p.getCarro();
            if (carro != null) {
                Seguradora s = carro.getSeguradora();
                if (s != null) {
                    return s.getNome();
                }
            }
        }
        return "";
        
    }
    
    public Seguradora getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(Seguradora seguradora) {
        this.seguradora = seguradora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
