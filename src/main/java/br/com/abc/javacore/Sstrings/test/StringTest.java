/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.Sstrings.test;

/**
 *
 * @author Larissa
 */
public class StringTest {
    public static void main(String[] args) {
        String nome = "Ramatis";
        String sobrenome = new String("da Silva");//1-variável de referência, 2-um objeto do tipo String, 
                                                  //3- uma String no pool de String
        nome = nome.concat(" Bezerra"); // nome+= " Bezerra";

        String teste = "Jesus";
        String teste2 = "     0123456789";
        System.out.println(teste.charAt(0));
    
        System.out.println(teste.equalsIgnoreCase(teste));
        System.out.println(teste.length());
        System.out.println((String)teste.replace('e', 'o'));
        System.out.println(teste.toLowerCase());
        System.out.println(teste.toUpperCase());
        System.out.println(teste2.substring(0, 2));
        System.out.println(teste2.trim());
        System.out.println(teste2);
        
    }
}
