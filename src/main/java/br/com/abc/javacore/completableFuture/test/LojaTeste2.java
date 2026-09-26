/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.completableFuture.test;

import br.com.abc.javacore.completableFuture.classes.Loja;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 *
 * @author Anezio
 */
public class LojaTeste2 {

    public static void main(String[] args) {
        List<Loja> lojas = asList(
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("Americanas"),
                new Loja("casasBahia"),
                new Loja("bestBuy"),
                new Loja("wallmart"),
                new Loja("wallmart"),
                new Loja("wallmart")
        );
//        acharPrecos(lojas);
        acharPrecos2(lojas);
//        acharPrecos3(lojas);
        acharPrecos4(lojas);

//        NumeroDeThreads = Ncpu*Ucpu*(1+W/C)
//        Ncpu = numero de nucleos disponiveis
//        Ucpu = quantidade de utilizacao da CPU (0 - 1)
//        W/C = Wait time/Compute time
//        Nthreads = 8*1*(1 + 99) = 800 threads
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(lojas.size());
        final Executor executor = Executors.newFixedThreadPool(Math.min(lojas.size(), 100), r -> {
            Thread t = new Thread(r);
            t.setDaemon(true);
            return t;
        });

//Como saberemos o numero de nucleos do processador?
        acharPrecos4(lojas, executor);
    }

    private static List<String> acharPrecos(List<Loja> lojas) {
        System.out.println("Stream sequencial.");
        long start = System.currentTimeMillis();
        List<String> collect = lojas.stream()
                .map(loja -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco()))
                .collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + "ms.");
        System.out.println(collect);
        return collect;
    }

    private static List<String> acharPrecos2(List<Loja> lojas) {
        System.out.println("Stream paralelo.");
        long start = System.currentTimeMillis();
        List<String> collect = lojas.parallelStream()
                .map(loja -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco()))
                .collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + "ms.");
        System.out.println(collect);
        return collect;
    }

    private static List<String> acharPrecos3(List<Loja> lojas) {
        System.out.println("Completable future.");
        long start = System.currentTimeMillis();

        List<String> collect = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(
                        () -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco())
                )).map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + "ms.");
        System.out.println(collect);
        return collect;
    }

    private static List<String> acharPrecos4(List<Loja> lojas) {
        System.out.println("Completable future.");
        long start = System.currentTimeMillis();

        List<CompletableFuture<String>> precoFuturo = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(
                        () -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco())
                ))
                .collect(Collectors.toList());
        System.out.println("Tempo de invocacao: " + (System.currentTimeMillis() - start) + "ms.");
        List<String> collect = precoFuturo.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + "ms.");
        System.out.println(collect);
        return collect;
    }
    
    private static List<String> acharPrecos4(List<Loja> lojas, Executor executor) {
        System.out.println("Completable future.");
        long start = System.currentTimeMillis();

        List<CompletableFuture<String>> precoFuturo = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(
                        () -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco()),executor
                ))
                .collect(Collectors.toList());
        System.out.println("Tempo de invocacao: " + (System.currentTimeMillis() - start) + "ms.");
        List<String> collect = precoFuturo.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + "ms.");
        System.out.println(collect);
        return collect;
    }

}
