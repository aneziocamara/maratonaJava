/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.expressoesregulares.test;

import java.util.Scanner;

/**
 *
 * @author Larissa
 */
public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("1 true 100 oi");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        System.out.println("*****************************");

        Scanner scanner2 = new Scanner("1 true 100 oi");
        while (scanner2.hasNext()) {
            if (scanner2.hasNextInt()) {
                int i = scanner2.nextInt();
                System.out.println("Int " + i);
            } else if (scanner2.hasNextBoolean()) {
                Boolean b = scanner2.nextBoolean();
                System.out.println(b);
            } else {
                System.out.println(scanner2.next());

            }
        }
    }
}
