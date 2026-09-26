/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.Sstrings.test;

/**
 *
 * @author anezi
 */
public class StringPerformanceTest {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String: " + (fim - inicio) + " ms.");

        long inicioSb = System.currentTimeMillis();
        concatString(200000);
        long fimSb = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder: " + (fimSb - inicioSb) + " ms.");
        
                long inicioSbf = System.currentTimeMillis();
        concatString(200000);
        long fimSbf = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer: " + (fimSbf - inicioSbf) + " ms.");
    }

    private static void concatString(int tam) {
        String string = "";
        for (int i = 0; i < tam; i++) {
            string += i;
        }
    }

    private static void concatStringBuilder(int tam) {
        StringBuilder sb = new StringBuilder(tam);
        for (int i = 0; i < tam; i++) {
            sb.append(i);
        }
        
    }
    
    private static void concatStringBuffer(int tam) {
        StringBuffer sbf = new StringBuffer(tam);
        for (int i = 0; i < tam; i++) {
            sbf.append(i);
        }
        
    }
}
