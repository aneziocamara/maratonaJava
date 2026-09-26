/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Larissa
 */
public class FileWriterReaderTest {

    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
//            FileWriter fw = new FileWriter(file, true);
            FileWriter fw = new FileWriter(file);
            FileReader fr = new FileReader(file);
            fw.write("Escrevendo uma mensagem no Arquivo.\nE pulando uma linha3.");
            fw.flush();
            char[] in = new char[500];
            int size = fr.read(in);
            System.out.println("Tamanho: " + size);
            for (char c : in) {
                System.out.print(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
//        try {
    

////            FileWriter fw = new FileWriter(file, true);
//            FileWriter fw = new FileWriter(file);
//            fw.write("Escrevendo uma mensagem no Arquivo.\nE pulando uma linha3.");
//            fw.flush();
//            fw.close();
//            
//            FileReader fr = new FileReader(file);
//            char[] in = new char[500];
//            int size = fr.read(in);
//            System.out.println("Tamanho: "+size);
//            for(char c : in){
//                System.out.print(c);
//            }
//            fr.close();
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
