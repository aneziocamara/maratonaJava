/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.associacao.classes;

/**
 *
 * @author anezi
 */
public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print() {
        System.out.println("******************Relatorio de Seminarios******************");
        System.out.println("Titulo do seminario: " + this.titulo);
        System.out.println("Professor palestrante: " + professor.getNome());
        if (this.professor != null) {
            System.out.println("Professor: " + this.professor.getNome());
        } else {
            System.out.println("Nenhum professor cadatrado para este seminario.");
        }
        if (this.local != null) {
            System.out.println("Endereco da palestra: " + this.local.getRua() + ", Bairro: " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local cadatrado para este seminario.");
        }

        if (alunos != null && alunos.length != 0) {

            System.out.println("*****Alunos participantes***** ");
            for (Aluno aluno : alunos) {
                System.out.println("Aluno: " + aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado.");
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
