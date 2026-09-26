/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.defult.test;

import br.com.abc.javacore.defult.interfaces.A;
import br.com.abc.javacore.defult.interfaces.B;
import br.com.abc.javacore.defult.interfaces.D;

/**
 *
 * @author Anezio
 */
public class C implements A,B{
    public static void main(String[] args) {
        new C().oi();
    }
    public void oi(){
        A.super.oi();
    }
            
}
