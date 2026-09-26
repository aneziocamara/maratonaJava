/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.assertions.test;

/**
 *
 * @author draro
 */
public class AssertTest {
    public static void main(String[] args) {       
        calculaSalario(-2000.00);  
        diasDaSemana(9);
    }
    private static void calculaSalario(double salario){
        assert(salario > 0):"O salario nao deve ser menor que zero. O salario veio "
                + "no valor de R$"+salario;
        //calculo do salario
    }
    
    public static void calcSalario(double salario){
        if(salario < 0){
            throw new IllegalArgumentException();
        }           
    }
    
    public static void diasDaSemana(int dia){
        switch (dia) {
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default:assert false;
        }
    }
}