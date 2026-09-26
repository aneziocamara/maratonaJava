/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.threads.test;

/**
 *
 * @author Anezio
 */
public class DeadLockTest {

    public static void main(String[] args) {
        new ThreadExemplo1().start();
        new ThreadExemplo2().start();
    }
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    private static class ThreadExemplo1 extends Thread {

        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: Segurando lock1.");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Esperando pelo lock2.");
                synchronized (lock2) {
                    System.out.println("Thread 1: Segurando lock1 e lock2.");
                }
            }
        }
    }

    private static class ThreadExemplo2 extends Thread {

        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 2: Segurando lock1.");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Esperando pelo lock2.");
                synchronized (lock2) {
                    System.out.println("Thread 2: Segurando lock2 e lock1.");
                }
            }
        }
    }

}
