/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.checkedexceptions.test;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Larissa
 */
public class CheckedExceptionTest {

    public static void main(String[] args) {
            abrirArquivo();    
    }

    public static void criarArquivo() throws IOException{
        File file = new File("teste.txt");
        try {
            System.out.println("Arquivo criado? " + file.createNewFile());
            System.out.println("Arquivo criado!");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
    public static void abrirArquivo(){
        
        try {
            System.out.println("Abrindo um arquivo!");
            System.out.println("Executando a leitura do arquivo.");
            throw new Exception();
            //System.out.println("Escrevendo no arquivo.");            
        } catch (Exception e) {
            System.out.println("Dentro do catch!");
            e.printStackTrace();
        }finally{
            System.out.println("Fechar o arquivo.");
        }
            
    }
}
