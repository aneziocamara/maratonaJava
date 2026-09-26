/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.completableFuture.classes;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Anezio
 */
public class Loja {
    
    private String nome;

    public Loja(String nome) {
        this.nome = nome;
    }

    public Loja() {
    }
    
    public double getPreco(){
//        Vai pegar o preco aonde judas perdeu as botas
return calcularPreco();
    }
    public Future<Double> getPrecoAsync(){
        CompletableFuture<Double> precoFuturo = new CompletableFuture<>();
        new Thread(()-> {
            try{
            precoFuturo.complete(calcularPreco());
            }catch(Exception e){
            precoFuturo.completeExceptionally(e);
            }
        }).start();
        return precoFuturo;
    }
    
    public Future<Double> getPrecoAsyncTunado(){
        return CompletableFuture.supplyAsync(this::calcularPreco);
    }
    
    private double calcularPreco(){
        delay();
//        System.out.println(1/0);
        return ThreadLocalRandom.current().nextDouble()*100;
    }
    
    private static void delay(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getNome() {
        return nome;
    }
    
}
