/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.modificadorfinal.classes;

/**
 *
 * @author draro
 */
public class Carro {
    public final Comprador COMPRADOR = new Comprador();
    public static final double VELOCIDADE_FINAL = 250;
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" + "nome=" + nome + ", marca=" + marca + '}';
    }

    public Comprador getComprador() {
        return COMPRADOR;
    }

    public static double getVELOCIDADE_FINAL() {
        return VELOCIDADE_FINAL;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
