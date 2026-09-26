/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.classesabstratas.test;

//import br.com.abc.javacore.classesabstratas.classes.Funcionario;
import br.com.abc.javacore.classesabstratas.classes.Gerente;
import br.com.abc.javacore.classesabstratas.classes.Vendedor;

/**
 *
 * @author Larissa
 */
public class FuncionarioTest{
    public static void main(String[] args) {
        
        Gerente g = new Gerente("Simao","2134-3",2000);
        Vendedor v = new Vendedor("Rose","1969-4",1500,5000);
        g.calculaSalario();
        v.calculaSalario();
        System.out.println(g);
        System.out.println("------------------------");
        System.out.println(v);
    }
}
