/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.abc.javacore.Kenum.classes;

/**
 *
 * @author draro
 */

public enum TipoCliente {
    //Constant Especific Class Body
    //Corpo de Classe Especifico Constante
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica"){
        public String getId(){
            return "B";
        }
    };
    
    private int tipo;
    private String nome;
    TipoCliente(int tipo, String nome){
       this.tipo = tipo;
       this.nome = nome;  
    }
    

    
    public String getId(){
        return "A";
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
    
}
