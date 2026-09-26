/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.heranca.classes;

/**
 *
 * @author anezi
 */
public class Phessoa {
    protected String nome;
    protected String cpf;
    protected Enderesso endereco;
    
    public Phessoa(String nome){
        this.nome = nome;
    }
    public Phessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }
    
    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF : "+this.cpf);
        System.out.println("Endereco: "+this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Enderesso getEndereco() {
        return endereco;
    }

    public void setEndereco(Enderesso endereco) {
        this.endereco = endereco;
    }
    
    
}
