/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.associacao.classes;

/**
 *
 * @author anezi
 */
public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print() {
        System.out.println("******************Relatorio de Professores******************");
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade do professor: " + this.especialidade);
        if (seminarios != null && seminarios.length != 0) {

            System.out.println("Seminarios participantes: ");
            for (Seminario seminario : seminarios) {
                System.out.println("Titulo: " + seminario.getTitulo() + " ");
            }
            return;
        }
        System.out.println("Professor nao vinculado a nenhum seminario."
                + "");
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
