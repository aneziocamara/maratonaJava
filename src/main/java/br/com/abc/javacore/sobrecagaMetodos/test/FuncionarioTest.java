/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.sobrecagaMetodos.test;

import br.com.abc.javacore.sobrecagaMetodos.classes.Funcionario;

/**
 *
 * @author Larissa
 */
public class FuncionarioTest {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("William", "123.345.567-67", 1500.50,"421.875");
        Funcionario funcionario2 = new Funcionario();
        funcionario.imprime();
        funcionario2.imprime();

    }
}
