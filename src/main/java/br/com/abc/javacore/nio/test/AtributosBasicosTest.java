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
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Larissa
 */
public class AtributosBasicosTest {

    public static void main(String[] args) throws IOException {
        Date primeiroDeDezembro = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
        File file = new File("folder2\\arquivo.txt");
        file.createNewFile();
        file.setLastModified(primeiroDeDezembro.getTime());
        System.out.println(file.lastModified());
        file.delete();
        Path path = Paths.get("folder2\\arquivo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.fromMillis(primeiroDeDezembro.getTime());
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);
        
        path = Paths.get("src\\main\\java\\br\\com\\abc\\javacore\\introducaoClasses\\classes\\Carro.java");
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));
        
        
//        BasicFileAttributes, PosixFileAttributes, DOSFileAttributes

        BasicFileAttributes atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Criacao: "+atributosBasicos.creationTime());
        System.out.println("Ultimo acesso: "+atributosBasicos.lastAccessTime());
        System.out.println("Ultima modificacao: "+atributosBasicos.lastModifiedTime());
        
        System.out.println("---------------------------------");
        
//        System.out.println("Eh um diretorio?: "+atributosBasicos.isDirectory());
//        System.out.println("Eh um link simbolico?: "+atributosBasicos.isSymbolicLink());
//        System.out.println("Eh um arquivo regular?: "+atributosBasicos.isRegularFile());
        
//        BasicFileAttributeView, PosixFileAttributeView, DOSFileAttributeView, FileOwnerAttributeView, AclFileAttributeView

        FileTime lastModified = atributosBasicos.lastModifiedTime();
        FileTime created = atributosBasicos.creationTime();
        FileTime lastAccess = FileTime.fromMillis(System.currentTimeMillis());
        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        basicView.setTimes(lastModified, lastAccess, created);
        atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
        
        System.out.println("Criacao: "+atributosBasicos.creationTime());
        System.out.println("Ultimo acesso: "+atributosBasicos.lastAccessTime());
        System.out.println("Ultima modificacao: "+atributosBasicos.lastModifiedTime());
    }
}
