/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Larissa
 */
public class CriandoPathTest {

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("C:\\Users\\casa\\Documents\\NetBeansProjects\\JavaOnLine\\folder2\\arquivo.txt");
        Path p2 = Paths.get("C:\\Users\\casa\\Documents\\NetBeansProjects\\JavaOnLine\\folder2", "arquivo.txt");
        Path p3 = Paths.get("C:", "Users\\casa\\Documents\\NetBeansProjects\\JavaOnLine\\folder2", "arquivo.txt");
        Path p4 = Paths.get("C:", "Users", "casa", "Documents", "NetBeansProjects", "JavaOnLine", "folder2", "arquivo.txt");
        System.out.println(p4.toAbsolutePath());
        File file = p4.toFile();
        Path path = file.toPath();

        Path path1 = Paths.get("Pasta");
        Path path2 = Paths.get("Pasta\\SubPasta\\SubsubPasta\\");
        Path arquivo = Paths.get("Pasta\\SubPasta\\SubsubPasta\\fyle.txt");

        try {
//            if(Files.notExists(path1))
//        Files.createDirectory(path1);    
            if (Files.notExists(path2.getParent())) {
                Files.createDirectories(path2.getParent());
            }
            if(Files.notExists(arquivo)){
            Files.createFile(arquivo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Path source = Paths.get("folder2\\arquivo.txt");
        Path target = Paths.get(path2.toString() + "\\arquivoCopiado.txt");
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            Files.deleteIfExists(target);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
