/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.sobrecagaconstrutores.classes;

/**
 *
 * @author Larissa
 */
public class Estudante {

    private String nome;
    private String matricula;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public Estudante(String nome, String matricula, double[] notas, String dataMatricula) {
        this(nome, matricula, notas);
        this.dataMatricula = dataMatricula;
    }

    public Estudante() {

    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        for (double nota : notas) {
            System.out.println("Notas: " + nota + " ");
        }
        System.out.println("Data da matricula: "+this.dataMatricula);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }
    public void setDataMatricula(String dataMatricula){
        this.dataMatricula = dataMatricula;
    }
    public String getDataMatricula(){
        return this.dataMatricula;
    }
}
