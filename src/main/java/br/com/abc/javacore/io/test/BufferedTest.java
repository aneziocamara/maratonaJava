/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Larissa
 */
public class BufferedTest {

    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try( BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))) {
            bw.write("Escrevendo uma mensagem no Arquivo.");
            bw.newLine();
            bw.write("Pulando uma linha3.");
            bw.flush();
            String s;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
//        try {
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write("Escrevendo uma mensagem no Arquivo.");
//            bw.newLine();
//            bw.write("Pulando uma linha3.");
//            bw.flush();
//            bw.close();
//
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String s = null;
//            while((s = br.readLine()) != null){
//                System.out.println(s);
//            }
//            br.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
