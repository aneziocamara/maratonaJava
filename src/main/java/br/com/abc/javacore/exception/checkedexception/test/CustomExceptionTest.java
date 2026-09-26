/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.exception.checkedexception.test;

import br.com.abc.javacore.exception.customexception.LoginInvalidoException;

/**
 *
 * @author draro
 */
public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();   
        }
    }
    private static void logar() throws LoginInvalidoException {
        String usuarioBancoDeDados = "Jesus";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "Jesus";
        String senhaDigitada = "112";
        
        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        } else {
            System.out.println("Logar!");
        }
    }
}
