/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.datas.test;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author anezi
 */
public class ManipulacaoDeDatasTest {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime() + 3600000);
        //System.out.println(date);
        
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        //c.setTime(date);
        if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("Domingo eh o primeiro dia da semana.");
        }
        System.out.println((int)c.get(Calendar.DAY_OF_WEEK));
        System.out.println((int)c.get(Calendar.DAY_OF_MONTH));
        System.out.println((int)c.get(Calendar.DAY_OF_YEAR));
         c.add(Calendar.HOUR, 24);
         c.add(Calendar.MONTH, 9);
        c.roll(Calendar.MONTH, 9);
        Date date2 = c.getTime();
        System.out.println(date2);
    }
    //Number/format, Locale, Calendar, Date, DateFormat
}
