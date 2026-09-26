/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.concorrencia.test;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Anezio
 */
public class LockTest {

    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        final ReentrantLock lock = new ReentrantLock();
        new Thread(new worker("A", lock)).start();
        new Thread(new worker("B", lock)).start();
        new Thread(new worker("C", lock)).start();
        new Thread(new worker("D", lock)).start();
        new Thread(new worker("E", lock)).start();
        new Thread(new worker("F", lock)).start();
        new Thread(new worker("G", lock)).start();
    }

    static class worker implements Runnable {

        private String nome;
        private ReentrantLock reentrantLock;

        public worker(String nome, ReentrantLock reentrantLock) {
            this.nome = nome;
            this.reentrantLock = reentrantLock;
        }

        @Override
        public void run() {
            reentrantLock.lock();
            try {
                if (reentrantLock.isHeldByCurrentThread()) {
                    System.out.printf("Thread %s entrou em uma sessão crítica%n ", nome);
                    System.out.printf("%d Threads esperando na fila ", reentrantLock.getQueueLength());
                    System.out.printf("Thread %s vai trabalhar por dois segundos%n ", nome);
                    Thread.sleep(2000);
                    System.out.printf("Thread %s finalizou o trabalho%n ", nome);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
