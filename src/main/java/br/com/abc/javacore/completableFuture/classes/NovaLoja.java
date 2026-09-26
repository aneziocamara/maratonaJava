/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.completableFuture.classes;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Anezio
 */
public class NovaLoja {

    private String nome;

    public NovaLoja(String nome) {
        this.nome = nome;
    }

    public NovaLoja() {
    }
//    NomeDaLoja:Preco:CodigoDeDesconto

    public String getPreco() {
        double preco = calcularPreco();
        Desconto.Codigo codigo = Desconto.Codigo.values()[ThreadLocalRandom.current()
                .nextInt(Desconto.Codigo.values().length)];
        return String.format("%s:%.2f:%s", nome, preco, codigo);
    }

    private double calcularPreco() {
        delay();
//        System.out.println(1/0);
        return ThreadLocalRandom.current().nextDouble() * 100;
    }

    private static void delay() {
        try {
            int delay = ThreadLocalRandom.current().nextInt(500, 2000);
            TimeUnit.MILLISECONDS.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getNome() {
        return nome;
    }

    public static List<NovaLoja> lojas() {
        return Arrays.asList(
                new NovaLoja("Americanas"),
                new NovaLoja("Casas Bahia"),
                new NovaLoja("Ricardo Eletro"),
                new NovaLoja("Havan")
        );
    }
}
