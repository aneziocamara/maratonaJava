/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.nio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author Larissa
 */
class AcharTodosOsBkp extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if(file.getFileName().toString().endsWith(".bkp")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class FileVisitorTest {

    public static void main(String[] args) throws IOException {
//        Files.walkFileTree(Paths.get("Pasta"), new AcharTodosOsBkp());
        Files.walkFileTree(Paths.get("Pasta"), new PrintDirs());
    }
}

class PrintDirs extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attr){
        System.out.println("Pre: "+dir);
        if(dir.getFileName().toString().equals("SubsubPasta")){
            return FileVisitResult.SKIP_SUBTREE;
        }
        return FileVisitResult.CONTINUE;
    }
    
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr){
        System.out.println("File: "+file.getFileName());
        return FileVisitResult.CONTINUE;
    }
    
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc)throws IOException{
    
        return FileVisitResult.CONTINUE;
    }
    
    
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc){
        System.out.println("Post: "+dir);
        return FileVisitResult.CONTINUE;
    }
}