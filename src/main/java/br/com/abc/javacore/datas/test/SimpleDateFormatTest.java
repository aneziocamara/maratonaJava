/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.datas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Larissa
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "'Parnamirim,' dd 'de' MMMM 'de' YYYY'.'";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);          
        System.out.println(formatador.format(c.getTime()));        
    }
}
