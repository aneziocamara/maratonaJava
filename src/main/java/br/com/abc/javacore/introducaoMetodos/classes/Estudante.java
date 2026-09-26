/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.introducaoMetodos.classes;

import java.util.Arrays;

/**
 *
 * @author anezi
 */
public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Notas: " + Arrays.toString(this.notas));
    }

    public void tirarMedia() {
        if (this.notas == null) {
            System.out.println("Este aluno nao possui notas.");
            return;
        }
        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        media = media / this.notas.length;

        if (media >= 6) {
            this.aprovado = true;
            System.out.println("Media: " + media + " - Aprovado!");
        } else {
            this.aprovado = false;
            System.out.println("Media: " + media + " - Reprovado!");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("Idade incorreta!");
            return;
        }
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }
    
    public boolean isAprovado(){
        return this.aprovado;
    }
}
