/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Larissa
 */
public class RelativizarTest {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/Willian");
        Path classe = Paths.get("/home/Willian/java/Pessoa.java");
        Path pathToClasse = dir.relativize(classe);
        System.out.println(pathToClasse);
        
        Path absoluto1 = Paths.get("/home/Willian");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/Willian/java/Pessoa.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/Fucionario.java");
        
        System.out.println("1 - "+absoluto1.relativize(absoluto3));
        System.out.println("2 - "+absoluto3.relativize(absoluto1));
        System.out.println("3 - "+absoluto1.relativize(absoluto2));
        System.out.println("4 - "+relativo1.relativize(relativo2));
        System.out.println("5 = "+absoluto1.relativize(relativo1));
    }
}
