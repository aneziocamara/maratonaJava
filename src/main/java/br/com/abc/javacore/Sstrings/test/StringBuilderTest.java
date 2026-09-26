/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.Sstrings.test;

/**
 *
 * @author anezi
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase qualquer!";
        StringBuilder sb = new StringBuilder(16);
        sb.append("Uma frase comum!");
        sb.append("0123456789");
        sb.append("def").insert(3, "ghi").reverse().delete(2, 4);
        System.out.println(s);
        System.out.println(sb);
        System.out.println(sb.delete(0, 4));
        
        
    }
   
}
