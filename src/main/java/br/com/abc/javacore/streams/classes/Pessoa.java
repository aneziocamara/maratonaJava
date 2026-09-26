/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.streams.classes;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Anezio
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double salario;
    private Genero genero;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public Pessoa(String nome, int idade, double salario, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.genero = genero;
    }
    
    
    
    public static List<Pessoa> bancoDePessoas(){
        return asList( 
                new Pessoa("Jesus Cristo",33,15000, Genero.MASCULINO),
                new Pessoa("Sananda",16,14000, Genero.MASCULINO),
                new Pessoa("Sananda",21,14000, Genero.MASCULINO),
                new Pessoa("Sofia",32,12000, Genero.FEMININO),
                new Pessoa("Emmanuel",15,10000, Genero.MASCULINO),
                new Pessoa("Chico Xavier",22,16000, Genero.MASCULINO),
                new Pessoa("Allan Kardec",24,11000, Genero.MASCULINO),
                new Pessoa("Euripedes Barsanulfo",40,17000, Genero.MASCULINO),
                new Pessoa("Ernesto Bozzano",20,14000, Genero.MASCULINO)
                );
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.nome);
        return hash;
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
        final Pessoa other = (Pessoa) obj;
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + '}';
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Genero getGenero() {
        return genero;
    }      
}
