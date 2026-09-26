/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.classesabstratas.classes;

/**
 *
 * @author Larissa
 */
public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario,double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public void imprime() {
        System.out.println("Metodo imprime em Vendedor");
    }
    
    @Override
    public void calculaSalario() {
        this.salario = salario + (totalVendas * 0.05);
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }



    
    


}
