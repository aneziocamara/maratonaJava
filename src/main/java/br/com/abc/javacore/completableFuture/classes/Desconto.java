/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.completableFuture.classes;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Anezio
 */
public class Desconto {

    public enum Codigo {
        NENHUM(0), SILVER(5), GOLD(10), PLATINUM(15), ELITE(20);
        private final int porcentagem;

        private Codigo(int porcentagem) {
            this.porcentagem = porcentagem;
        }

        public int getPorcentagem() {
            return porcentagem;
        }
    }

    public static String calcularDesconto(Orcamento orcamento) {
        return String.format("%s: o preco original eh %.2f, desconto de %d, "+"e o preco final eh %.2f",
                orcamento.getNomeLoja(),
                orcamento.getPreco(),
                orcamento.getCodigoDesconto().getPorcentagem(),
                calculo(orcamento.getPreco(),
                        orcamento.getCodigoDesconto()));
    }

    private static double calculo(double preco, Codigo codigo) {
        delay();
        return preco * (100 - codigo.porcentagem) / 100;
    }

    private static void delay() {
        try {
            int delay = ThreadLocalRandom.current().nextInt(500, 2000);
            TimeUnit.MILLISECONDS.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
