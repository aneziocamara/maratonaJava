/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.optional.test;


import br.com.abc.javacore.optional.classes.Carro;
import br.com.abc.javacore.optional.classes.Pessoa;
import br.com.abc.javacore.optional.classes.Seguradora;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Anezio
 */
public class OptionalTest2 {
    public static void main(String[] args) {
        Seguradora seguradora = new Seguradora("Aruanda Seguros");
        Carro carro = new Carro(seguradora, "Audi");
        Pessoa p = new Pessoa(carro,"Jesus");
        obterNomeSeguradora(Optional.ofNullable(p));
        checarNomeSeguradora(seguradora);
        checarNomeSeguradoraOptional(seguradora);
        checarNomeSeguradoraOptional_2(seguradora);
        p.setIdade(20);
        System.out.println(obterNomeSeguradoraComIdade(p, 18));
        Map<String, String> map = new HashMap<>();
        System.out.println(Optional.ofNullable(map.get("Jesus")));
    }
    
    
    private static Optional<Integer> stringToInt(String numero){
        try {
            return Optional.of(Integer.parseInt(numero));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
    
    private static void checarNomeSeguradora(Seguradora seguradora){
        if (seguradora != null && seguradora.getNome().equals("Aruanda Seguros")) {
            System.out.println("Eh a seguradora Aruanda.");
        }
    }
    
    private static void checarNomeSeguradoraOptional(Seguradora seguradora){
        Optional<Seguradora> seguradoraOptional = Optional.ofNullable(seguradora);
        seguradoraOptional.filter(s -> s.getNome().equals("Aruanda Seguros"))
                .ifPresent(x -> {System.out.println("Eh a seguradora Aruanda.");});
    }
    private static void checarNomeSeguradoraOptional_2(Seguradora seguradora){
        Optional.ofNullable(seguradora).filter(s -> s.getNome().equals("Aruanda Seguros"))
                .ifPresent(x -> {System.out.println("Eh a seguradora Aruanda.");});
    }
    
    private static String obterNomeSeguradoraComIdade(Pessoa p, int idadeMinima){
        return Optional.ofNullable(p)
                .filter(pessoa -> pessoa.getIdade() >= idadeMinima)
                .flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Nao existe seguradora ou a idade minima nao foi atingida.");
    }
    
    public static String obterNomeSeguradora(Optional<Pessoa> p){
        System.out.println(p
                .flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Nao existe seguradora.")
        );
        return "";
    }    
}
