/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.serializacao.test;

import br.com.abc.javacore.serializacao.classes.Aluno;
import br.com.abc.javacore.serializacao.classes.Turma;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Larissa
 */
public class SerializacaoTest {
    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();
    }
    private static void gravadorObjeto(){
        Turma t = new Turma("Fraternidade dos Discipulos de Jesus - FDJ");
        Aluno aluno = new Aluno(1L,"Jesus","123456");
        aluno.setTurma(t);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void leitorObjeto(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno)ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
