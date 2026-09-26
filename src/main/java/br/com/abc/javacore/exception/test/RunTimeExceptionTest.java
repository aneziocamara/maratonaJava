/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.exception.test;

/**
 *
 * @author anezi
 */
public class RunTimeExceptionTest {
    public static void main(String[] args) {
        Object o = null; 
        int a = 10;
        int b = 0;
        if(b != 0){
        int c = a/b;
            System.out.println(c);
        }
        int[] e = new int[2];
        System.out.println(e[2]);
    }
}
