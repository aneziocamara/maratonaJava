/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.nio.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/**
 *
 * @author Larissa
 */
public class DosFileAttributesTest {

    public static void main(String[] args) {
        Path path = Paths.get("folder2\\teste.txt");
        try {
//            Files.createFile(path);
            Files.setAttribute(path, "dos:hidden", true);
            Files.setAttribute(path, "dos:readonly", true);
            DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());
//            Files.setAttribute(path, "dos:hidden", false);
//            Files.setAttribute(path, "dos:readonly", false);
            DosFileAttributeView dosview = Files.getFileAttributeView(path, DosFileAttributeView.class);
            dosview.setHidden(false);
            dosview.setReadOnly(false);
            dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
