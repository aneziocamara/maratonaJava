/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.dateTime.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Anezio
 */
public class DateTimeAPITest2 {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(LocalDateTime.now());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());  //999.999.999
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3, 0));
        System.out.println(Instant.ofEpochSecond(2, 1_000_000_000));
        System.out.println(Instant.ofEpochSecond(4, -1_000_000_000));
        System.out.println("------------Duration---------------");
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.of(2017, 1, 1, 23, 0, 0);
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(5, 0, 0);
//        Não pode usar LocalDate
//        Não pode misturar LocalDateTime com LocalTime
        Duration d1 = Duration.between(dt1, dt2);
        Duration d2 = Duration.between(time1, time2);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
//        Duration d4 = Duration.between(dt2,time2);
//        Duration d5 = Duration.between(LocalDate.now(), LocalDate.now().plusDays(20));
        Duration d6 = Duration.between(dt2, time2.atDate(dt2.toLocalDate()));
        Duration d7 = Duration.ofMinutes(3);
        Duration d8 = Duration.ofDays(10);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
//        System.out.println(d4);
//        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d7);
        System.out.println(d8);
        System.out.println("---------------------Period---------------------");
        
        Period p1 = Period.between(dt1.toLocalDate(), dt2.toLocalDate());
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        LocalDateTime now = LocalDateTime.now();
        System.out.println((int) now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));
        
        System.out.println("---------------------ChronoUnit---------------------");
        LocalDateTime niver = LocalDateTime.of(1966, 5, 7, 7, 0, 0);
        System.out.println(ChronoUnit.DAYS.between(niver, now));
        System.out.println(ChronoUnit.MONTHS.between(niver, now));
        System.out.println(ChronoUnit.WEEKS.between(niver, now));
        System.out.println(ChronoUnit.YEARS.between(niver, now));
               
    }
}
