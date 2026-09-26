/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author anezi
 */
public class LocaleTest {
    public static void main(String[] args) {
//        ISO 639 - pt(português), br(Brasil), en(inglês), us(EUA).

        Locale it = Locale.forLanguageTag("it-IT");
        Locale itCH = Locale.forLanguageTag("it-CH");
        Locale in = Locale.forLanguageTag("hi-IN");
        Locale jp = Locale.forLanguageTag("ja-JP");

        Calendar c = Calendar.getInstance();
        c.set(2026, Calendar.JUNE, 24);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, it);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, itCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, in);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, jp);
        System.out.println("Italia - "+df.format(c.getTime()));
        System.out.println("Suica - "+df2.format(c.getTime()));
        System.out.println("India - "+df3.format(c.getTime()));
        System.out.println("Japao - "+df4.format(c.getTime()));
        System.out.println(it.getDisplayLanguage());
        System.out.println(itCH.getDisplayLanguage());
        System.out.println(in.getDisplayLanguage());
        System.out.println(jp.getDisplayLanguage(it));
    }
}
