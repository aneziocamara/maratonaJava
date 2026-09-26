/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.nio.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Larissa
 */
public class ZipandoTest {

    public static void main(String[] args) {
        Path dirZip = Paths.get("Pasta/SubPasta");
        Path dirFiles = Paths.get("Pasta/SubPasta/SubsubPasta");
        Path zipFile = dirZip.resolve("arquivo.zip");
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile())); 
                DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)) {
            for (Path path : stream) {
                
                zip.putNextEntry(new ZipEntry(path.getFileName().toString()));
                FileInputStream fileInputStream = new FileInputStream(path.toFile());
//                BufferedInputStream bf = new BufferedInputStream(fileInputStream);
                byte[] buff = new byte[2048];
                int bytesRead;
                while((bytesRead = fileInputStream.read(buff)) > 0){
                    zip.write(buff,0,bytesRead);
                }
                zip.flush();
                zip.closeEntry();
                fileInputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
