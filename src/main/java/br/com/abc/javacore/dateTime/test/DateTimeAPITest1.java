/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.dateTime.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Anezio
 */
public class DateTimeAPITest1 {
    public static void main(String[] args) {
//        System.out.println(new Date());
//        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2057, Month.MAY, 7);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.lengthOfYear());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
       LocalDate now = LocalDate.now();
        System.out.println(date);
        System.out.println(now);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println("---------------LocalTime---------------");
        LocalTime time = LocalTime.of(22, 2, 15);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(time);
        System.out.println("---------------Parsing---------------");
        LocalDate parseDate = LocalDate.parse("2017-02-15");
        LocalTime parseTime = LocalTime.parse("22:25:10");
        System.out.println(parseDate);
        System.out.println(parseTime);
        System.out.println("---------------LocalDateTime---------------");
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2017,8,6,22,30,14);
        LocalDateTime ldt3 = date.atTime(22, 15, 20);
        LocalDateTime ldt4 = date.atTime(time);
        LocalDateTime ldt5 = date.atTime(LocalTime.now());
        LocalDateTime ldt6 = time.atDate(LocalDate.now());
        LocalDateTime ldt7 = time.atDate(date);
        
            
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3); 
        System.out.println(ldt4); 
        System.out.println(ldt5); 
        System.out.println(ldt6); 
        System.out.println(ldt7); 
    }
}
