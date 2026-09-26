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
public class Celular {

    private String nome;
    private String IMEI;

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    @Override
    public String toString() {
        return "Celular{" + "nome=" + nome + ", IMEI=" + IMEI + '}';
    }
            
//    O método equals tem que ser reflexivo, ou seja, x.equals(x) tem que ser true para tudo que for diferente de null.
//    Simétrico: para x e y != null, se x.equals(y) = true, y.equals(x) tem que ser true.
//    Transitividade: para x,y e z != null, se x.equals(y) = true, logo y.equals(x) = true,e x.equals(z) = true, logo y.equals(z) = true.
//    Consistente: x.equals(y) tem que retornar o mesmo valor.
//    Para x != null, x.equals(null) tem que ser false.
//    Para hashCode:
//    Se x.equals(y) == true, y.hashCode() == x.hashCode().
//    y.hashCode() == x.hashCode() não necessariamente o equals deverá retornar true.
//    x.equals(y) == false, não precisa ter nada no hashCode.
//    y.hashCode() != x.hashCode(), x.equals(y) == false.

    @Override
    public int hashCode() {
//        int hash = 7;
//        hash = 23 * hash + Objects.hashCode(this.nome);
//        hash = 23 * hash + Objects.hashCode(this.IMEI);
//        return hash;
        return IMEI != null ? IMEI.hashCode() : 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Celular outroCelular = (Celular) obj;
        if (!Objects.equals(this.nome, outroCelular.nome)) {
            return false;
        }
//        return Objects.equals(this.IMEI, other.IMEI);
        return IMEI != null && IMEI.equals(outroCelular.getIMEI());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

}
