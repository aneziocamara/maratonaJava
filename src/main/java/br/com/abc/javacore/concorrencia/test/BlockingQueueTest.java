/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.concorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Anezio
 */
public class BlockingQueueTest {

    public static void main(String[] args) throws InterruptedException {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        Thread t1 = new Thread(new RemoveFromQueue(bq));
        bq.put("Jesus");
        System.out.println(bq.peek());
        System.out.println("Tentando colocar outro valor.");
        t1.start();
        bq.put("Rei de Nebadon");
        System.out.println("Governador da Terra.");
        System.out.println("Inserindo o último valor.");
    }

    static class RemoveFromQueue implements Runnable {

        private BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " entrando em espera por dois segundos.");
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Removendo os valores " + bq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
