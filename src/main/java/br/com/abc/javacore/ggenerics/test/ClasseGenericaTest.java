/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.ggenerics.test;

import br.com.abc.javacore.ggenerics.classes.Carro;
import br.com.abc.javacore.ggenerics.classes.Computador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Larissa
 */
public class ClasseGenericaTest {

    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getObjetoDisponivel();
        System.out.println("Usando o carro por um mes.");
        carroAlugavel.devolverObjeto(carro);
        System.out.println("-----------------------------");
        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("Lenovo"));
        computadoresDisponiveis.add(new Computador("Sony"));
        ObjetosAlugaveis<Computador> computadorAlugavel = new ObjetosAlugaveis<>(computadoresDisponiveis);
        Computador computador = computadorAlugavel.getObjetoDisponivel();
        System.out.println("Usando o PC");
        computadorAlugavel.devolverObjeto(computador);
    }
}
//Type

class ObjetosAlugaveis<T> {

    final private List<T> objetosDisponiveis;

    public ObjetosAlugaveis(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }
//    Alugar

    public T getObjetoDisponivel() {
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponiveis: " + objetosDisponiveis);
        return t;
    }

    public void devolverObjeto(T t) {
        System.out.println("Devolver objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis: " + objetosDisponiveis);
    }
}

class DoisAtributos<T,X>{
    T um;
    X dois;

    public DoisAtributos(T um, X dois) {
        this.um = um;
        this.dois = dois;
    }

    @Override
    public String toString() {
        return "DoisAtributos{" + "um=" + um + ", dois=" + dois + '}';
    }

    public T getUm() {
        return um;
    }

    public void setUm(T um) {
        this.um = um;
    }

    public X getDois() {
        return dois;
    }

    public void setDois(X dois) {
        this.dois = dois;
    }
}
