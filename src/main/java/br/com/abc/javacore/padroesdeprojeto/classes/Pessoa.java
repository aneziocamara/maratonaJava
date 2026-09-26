/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.padroesdeprojeto.classes;

/**
 *
 * @author Anezio
 */
public class Pessoa {

    private String nome;
    private String nomeDoMeio;
    private String ultimoNome;
    private String apelido;
    private String nomeDoPai;

    public Pessoa() {

    }

    private Pessoa(String nome, String nomeDoMeio, String ultimoNome, String apelido, String nomeDoPai) {
        this.nome = nome;
        this.nomeDoMeio = nomeDoMeio;
        this.ultimoNome = ultimoNome;
        this.apelido = apelido;
        this.nomeDoPai = nomeDoPai;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", nomeDoMeio=" + nomeDoMeio + ", ultimoNome="
                + ultimoNome + ", apelido=" + apelido + ", nomeDoPai=" + nomeDoPai + '}';
    }

    public static class PessoaBuilder {

        private String nome;
        private String nomeDoMeio;
        private String ultimoNome;
        private String apelido;
        private String nomeDoPai;

        public PessoaBuilder(String nome) {
            this.nome = nome;
        }

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder nomeDoMeio(String nomeDoMeio) {
            this.nomeDoMeio = nomeDoMeio;
            return this;
        }

        public PessoaBuilder ultimoNome(String ultimoNome) {
            this.ultimoNome = ultimoNome;
            return this;
        }

        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public PessoaBuilder nomeDoPai(String nomeDoPai) {
            this.nomeDoPai = nomeDoPai;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(nome, nomeDoMeio, ultimoNome, apelido, nomeDoPai);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

}
