/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Larissa
 */
public class FileDiretoryTest{
    public static void main(String[] args) throws IOException {
//        File file = new File("folder");
//        boolean mkdir = file.mkdir();
//        System.out.println("Diretorio criado: "+mkdir);
//        File arquivo = new File("C:\\Users\\casa\\Documents\\NetBeansProjects\\JavaOnLine\\folder\\arquivo.txt");
//        boolean newfile = arquivo.createNewFile();
//        System.out.println("Arquivo criado: "+newfile);

//        File diretorio = new File("folder");
//        boolean mkdir = diretorio.mkdir();
//        System.out.println("Diretorio criado: "+mkdir);
//        File arquivo = new File(diretorio, "arquivo.txt");
//        boolean newfile = arquivo.createNewFile();
//        System.out.println("Arquivo criado: "+newfile);
//        
//        File arquivoNovoNome = new File(diretorio,"arquivo_renomeado.txt");
//        boolean renamed = arquivo.renameTo(arquivoNovoNome);
//        System.out.println("Renomeado: "+renamed);
//        
//        File diretorioRenomeado = new File("folder2");
//        boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
//        System.out.println("Diretorio renomeado: "+diretorioRenomeado);

buscarArquivo();
    }
    public static void buscarArquivo(){
        File file = new File("folder2");
        String[] list = file.list();
        for(String arquivo : list){
            System.out.println(arquivo);
        }
    }
}
