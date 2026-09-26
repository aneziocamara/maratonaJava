/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.heranca.classes;

/**
 *
 * @author anezi
 */
public class Funsionario extends Phessoa{
    private double salario;
    
    public Funsionario(String nome){
        super(nome);
    }
    
    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Salario: R$"+this.salario);
        imprimeReciboPagamento();
    }
    
    public void imprimeReciboPagamento(){
        System.out.println("Eu, "+super.nome+", recebi pagamento de R$"+this.salario+".");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
