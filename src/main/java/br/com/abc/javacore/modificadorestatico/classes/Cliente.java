/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.modificadorestatico.classes;

/**
 *
 * @author anezi
 */
public class Cliente {
//    1 - Bloco de inicializacao eh executado quando a JVM carregar a classe (eh executado apenas uma vez).
//    2 - Alocado espaço na memória para o objeto que será criado.
//    3 - Cada atributo de classe é criado e inicializado com seus valores default ou explícitos.
//    4 - O bloco de inicialização é criado.
//    5 - O construtor é executado.

    private static int[] parcelas;

    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao estatico!");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }

    }

    public Cliente() {

    }

    public static int[] getParcelas() {
        return parcelas;
    }

}
