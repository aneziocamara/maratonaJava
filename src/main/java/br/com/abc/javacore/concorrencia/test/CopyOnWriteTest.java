/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.concorrencia.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Anezio
 */
//Exemplo de classe imutável
//final class Pessoa{
//    private final String nome;
//    
//    public Pessoa(String nome){
//        this.nome = nome;
//    }
//    public String getNome(){
//        return nome;
//    }
//}
public class CopyOnWriteTest implements Runnable {
//    private List<Integer> lista = Collections.synchronizedList(new ArrayList<>());

    private List<Integer> list = new CopyOnWriteArrayList<>();

    public CopyOnWriteTest() {
        for (int i = 0; i < 9000; i++) {
            list.add(i);
        }
    }

    @Override
    public void run() {
        Iterator<Integer> iterator = list.iterator();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (iterator.hasNext()) {
            System.out.println(Thread.currentThread().getName() + " " + iterator.next());
        }
    }

    public List<Integer> getList() {
        return list;
    }

    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        CopyOnWriteTest ct = new CopyOnWriteTest();
        Thread t1 = new Thread(ct);
        Thread t2 = new Thread(ct);
        Thread removedor = new Thread(new RemovedorMembros(ct.getList()));
        t1.start();
        t2.start();
        removedor.start();
    }

    private static class RemovedorMembros implements Runnable {

        private List<Integer> list;

        public RemovedorMembros(List<Integer> list) {
            this.list = list;
        }
        
        @Override
        public void run() {
            for (int i = 0; i < 500; i++) {
                System.out.println(Thread.currentThread().getName()+" removeu: "+list.remove(i));
            }
        }

    }
}
