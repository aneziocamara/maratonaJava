/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.io.test;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Larissa
 */
public class FileTest {

    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            System.out.println(file.createNewFile());
            boolean exists = file.exists();
            System.out.println("Permissao de leitura? "+file.canRead());
            System.out.println("Caminho? "+file.getPath());
            System.out.println("Caminho completo? "+file.getAbsolutePath());
            System.out.println("Diretorio? "+file.isDirectory());
            System.out.println("Arquivo oculto? "+file.isHidden());
            System.out.println("Ultima modificacao? "+new Date(file.lastModified()));
            if (exists) {
                System.out.println("Arquivo existe? " + file.delete());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
