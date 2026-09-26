/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.threads.classes;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Anezio
 */
public class ListaMembros {
    private final Queue<String> emails = new LinkedList<>();
    private boolean aberta = true;
    
    public int getEmeailsPendentes(){
        synchronized (emails) {
            return this.emails.size();
        }
    }

    public boolean isAberta() {
        return aberta;
    }
    
    public String obterEmailMembro(){
        String email = null;
        try {
            synchronized (this.emails) {
                while(this.emails.size() == 0){
                    if(!aberta) return null;
                    System.out.println("Lista vazia, colocando a thread: "+Thread.currentThread().getName()+" em modo wait.");
                    this.emails.wait();
                }
                email = this.emails.poll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return email;
    }
    public void adicionarEmailMembro(String email){
        synchronized (this.emails) {
            this.emails.add(email);
            System.out.println("Email adicionado na lista.");
            System.out.println("Notificando as Threads que estao em espera."+Thread.currentThread().getName());
            this.emails.notifyAll();
        }
    }
    public void fecharLista(){
        System.out.println("Notificando todas as Threads e fechando a lista.");
        aberta = false;
        synchronized (this.emails) {
            this.emails.notifyAll();
        }
    }
}
