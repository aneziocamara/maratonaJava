/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.colecoes.classes;

import java.util.Objects;

/**
 *
 * @author Larissa
 */
public class Produto implements Comparable<Produto> {

    private String serialNumber;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String serialNumber, String nome, double preco) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String serialNumber, String nome, double preco, int quantidade) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
        
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return Objects.equals(this.serialNumber, other.serialNumber);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.serialNumber);
        return hash;
    }

    @Override
    public String toString() {
        return "Produto{" + "serialNumber=" + serialNumber + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outroObjeto) {
//        negativo se thisObject < outroObjeto
//        zero se thisObject == outroObjeto
//        positivo se thisObject > outroObjeto
//        return this.serialNumber.compareTo(outroObjeto.getSerialNumber());
//        return this.getNome().compareTo(outroObjeto.getNome());
//        return this.preco.compareTo(outroObjeto.getPreco());
        Double d = preco;
        return d.compareTo(outroObjeto.getPreco());
    }
}
