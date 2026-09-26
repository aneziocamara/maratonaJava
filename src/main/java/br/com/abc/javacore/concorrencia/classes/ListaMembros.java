/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.concorrencia.classes;

import br.com.abc.javacore.threads.classes.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Anezio
 */
public class ListaMembros {

    private final Queue<String> emails = new LinkedList<>();
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition conditionLock = lock.newCondition();
    private boolean aberta = true;

    public int getEmeailsPendentes() {
        lock.lock();
        try {
            return this.emails.size();
        } finally {
            lock.unlock();
        }
    }

    public boolean isAberta() {
        return aberta;
    }

    public String obterEmailMembro() {
        String email = null;
        try {
            lock.lock();
            while (this.emails.size() == 0) {
                if (!aberta) {
                    return null;
                }
                System.out.println("Lista vazia, colocando a thread: " + Thread.currentThread().getName() + " em modo wait.");
                conditionLock.await();
            }
            email = this.emails.poll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return email;
    }

    public void adicionarEmailMembro(String email) {
        lock.lock();
        try {
            this.emails.add(email);
            System.out.println("Email adicionado na lista.");
            System.out.println("Notificando as Threads que estao em espera." + Thread.currentThread().getName());
            conditionLock.signalAll();
        } finally {
            lock.unlock();
        }

    }

    public void fecharLista() {
        System.out.println("Notificando todas as Threads e fechando a lista.");
        aberta = false;
        lock.lock();
        try {
            this.emails.notifyAll();
        } finally {
            lock.unlock();
        }
    }
}
