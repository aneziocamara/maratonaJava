/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.concorrencia.classes;

import br.com.abc.javacore.threads.classes.*;

/**
 *
 * @author Anezio
 */
public class Entregador implements Runnable{
    private ListaMembros listaMembros;

    public Entregador(ListaMembros listaMembros) {
        this.listaMembros = listaMembros;
    }
    
    @Override
    public void run(){
        String nomeThread = Thread.currentThread().getName();
        System.out.println(nomeThread+" comecando o trabalho de entrega.");
        int qtdPendente = listaMembros.getEmeailsPendentes();
        boolean aberta = listaMembros.isAberta();
        while(aberta || qtdPendente > 0){
            try {
                String email = listaMembros.obterEmailMembro();
                if (email != null) {
                    System.out.println(nomeThread+" enviando email para "+email);
                    Thread.sleep(2000);
                    System.out.println("Envio para "+email+" concluido com sucesso!");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            aberta = listaMembros.isAberta();
            qtdPendente = listaMembros.getEmeailsPendentes();
        }
        System.out.println("Atividades finalizadas!");
    }
}
