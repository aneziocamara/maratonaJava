/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.exception.customexception;

/**
 *
 * @author draro
 */
public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login de usuario ou senha invalidos!");
    }
}
