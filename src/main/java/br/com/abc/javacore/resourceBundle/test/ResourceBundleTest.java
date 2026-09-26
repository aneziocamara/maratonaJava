/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.resourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Larissa
 */
public class ResourceBundleTest {

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("messages", Locale.of("en", "US"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("show"));
        ResourceBundle.clearCache();
        rb = ResourceBundle.getBundle("messages", Locale.of("pt", "BR"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        ResourceBundle.clearCache();
        System.out.println(rb.getString("show"));
       
    }
}
