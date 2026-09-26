/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.dateTime.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

/**
 *
 * @author Anezio
 */
public class DateTimeAPITest6 {
    public static void main(String[] args) {
        for (Map.Entry<String, String> zonas : ZoneId.SHORT_IDS.entrySet()) {
            System.out.println(zonas.getKey() + " "+zonas.getValue());
        }
        System.out.println("--------------------------------");
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        
        ZonedDateTime zoneDateTime = dateTime.atZone(tokyoZone);
        System.out.println(zoneDateTime);
        
    }
}


