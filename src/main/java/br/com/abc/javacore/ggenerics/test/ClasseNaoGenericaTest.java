/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.ggenerics.test;

import br.com.abc.javacore.ggenerics.classes.Carro;
import br.com.abc.javacore.ggenerics.classes.Computador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Larissa
 */
public class ClasseNaoGenericaTest {
    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por um mes.");
        carroAlugavel.devolverCarro(carroAlugado);
        System.out.println("----------------------------------");
        ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
        Computador computadorAlugado = computadorAlugavel.getComputadorDisponivel();
        System.out.println("Usando o computador por um mes.");
        computadorAlugavel.devolverComputador(computadorAlugado);
    }
}

class CarroAlugavel{
    private List<Carro> carrosDisponiveis = new ArrayList<>();
    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
    }
//    Alugar
    public Carro getCarroDisponivel(){
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+c);
        System.out.println("Carros disponiveis: "+carrosDisponiveis);
        return c;
    }
    public void devolverCarro(Carro c){
        System.out.println("Devolver carro: "+c);
        carrosDisponiveis.add(c);
        System.out.println("Carros disponiveis: "+carrosDisponiveis);
    }
    
}

class ComputadorAlugavel{
    private List<Computador> computadoresDisponiveis = new ArrayList<>();
    {
        computadoresDisponiveis.add(new Computador("Positivo"));
        computadoresDisponiveis.add(new Computador("Vaio"));
    }
//    Alugar
    public Computador getComputadorDisponivel(){
        Computador c = computadoresDisponiveis.remove(0);
        System.out.println("Alugando computador: "+c);
        System.out.println("Computadores disponiveis: "+computadoresDisponiveis);
        return c;
    }
    public void devolverComputador(Computador c){
        System.out.println("Devolver computador: "+c);
        computadoresDisponiveis.add(c);
        System.out.println("Computadores disponiveis: "+computadoresDisponiveis);
    }
    
}