/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.expressoesregulares.test;

/**
 *
 * @author Larissa
 */
public class TokenTest {

    public static void main(String[] args) {
        String str = "Willian, Paulo, Joana, Camila, Anna, John, Matheus";
        String[] tokens = str.split(",");
        for(String arr : tokens){
            System.out.println(arr.trim());
        }
        System.out.println("--------------------------------------");
        String str1 = "Willian, Paulo, Joana, Camila, Anna, John, Matheus";
        String[] tokens1 = str1.split(" ");
        for(String arr : tokens1){
            System.out.println(arr.trim());
        }
        System.out.println("--------------------------------------");
        String str2 = "Willian1 Paulo2 Joana3 Camila4 Anna5 John6 Matheus7";
        String[] tokens2 = str2.split("\\d");
        for(String arr : tokens2){
            System.out.println(arr.trim());
        }
        
        
    }
}
