/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.classesinternas.test;

/**
 *
 * @author anezi
 */
public class ClassesInternasTest {
    private String nome = "Jesus Cristo, Rei dos Reis!";
    
    class Interna {
        public void verClasseExterna(){
            System.out.println(nome);
            System.out.println(this);
            System.out.println(ClassesInternasTest.this);
        }
    }
    
    public static void main(String[] args) {
        ClassesInternasTest externa = new ClassesInternasTest();
        ClassesInternasTest.Interna in = externa.new Interna();
        ClassesInternasTest.Interna in2 = new ClassesInternasTest().new Interna();
        in.verClasseExterna();
//        in2.verClasseExterna();
    }
}

//class Externa{
//    private String nome = "Jesus Cristo, Rei dos Reis!";
//    
//    class Interna {
//        public void verClasseExterna(){
//            System.out.println(nome);
//        }
//    }
//}