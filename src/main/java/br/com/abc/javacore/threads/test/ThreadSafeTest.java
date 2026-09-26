/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.threads.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Anezio
 */
class ListaNomes {
    private List<String> nomes = new LinkedList<>();
    public synchronized void add(String nome){
        nomes.add(nome);
    }
    public synchronized void removerPrimeiro(){
        if (nomes.size() > 0) {
            System.out.println(nomes.remove(0));
        }else{
            System.out.println("A lista estah vazia, nada pra remover!");
        }
    }
}
public class ThreadSafeTest {
    public static void main(String[] args) {
        ListaNomes nome = new ListaNomes();
        nome.add("Jesus Cristo");
        class RemovedorDeNomes extends Thread{
            @Override
            public void run(){
                nome.removerPrimeiro();
            }
        }
        new RemovedorDeNomes().start();
        new RemovedorDeNomes().start();        
    }
}
