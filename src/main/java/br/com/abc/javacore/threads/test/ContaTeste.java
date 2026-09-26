/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.threads.test;

import br.com.abc.javacore.threads.classes.Conta;

/**
 *
 * @author Anezio
 */
public class ContaTeste implements Runnable {

    private Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTeste contateste = new ContaTeste();
        Thread william = new Thread(contateste, "William");
        Thread anna = new Thread(contateste, "Anna");
        william.start();
        anna.start();
    }

    public void imprime() {
        synchronized (ContaTeste.class) {
            System.out.println("teste");
        }
    }

    private void saque(int valor) {
        synchronized (conta) {
            if (conta.getSaldo() >= valor) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " estah indo sacar!");
                conta.saque(valor);
                System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo() + ".");
            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, saldo: " + conta.getSaldo() + ".");
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo() < 0) {
                System.out.println("Oh meu Deus!");
            }
        }
    }
}
