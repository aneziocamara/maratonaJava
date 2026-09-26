/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.lambdas.test;

import br.com.abc.javacore.lambdas.classes.Carro;
import br.com.abc.javacore.lambdas.classes.ComparadorCarro;
import static br.com.abc.javacore.lambdas.test.LambdaTest2.forEach;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *
 * @author Anezio
 */
public class LambdaTest3 {

    public static void main(String[] args) {
        forEach(asList("Jesus", "Cristo", "PrincipeDaPaz"), System.out::println);
        List<Carro> carros = asList(new Carro("Preto", 2020),
                new Carro("Marron", 2011), new Carro("Branco Gelo", 1993), new Carro("Verde Metalico", 2017));
//        Collections.sort(carros, (o1,o2) -> o1.getCor().compareTo(o2.getCor()));
//        System.out.println(carros);
//Referencia a um metodo estatico
        Collections.sort(carros, ComparadorCarro::comparePorCor);
        System.out.println(carros);
//        Referencia a uma instancia de metodo de um objeto em particular
        ComparadorCarro comparadorCarro = new ComparadorCarro();
        Supplier<ComparadorCarro> comparadorCarroSuppplier = ComparadorCarro::new;
        Collections.sort(carros, comparadorCarroSuppplier.get()::comparePorAno);
//        Collections.sort(carros, comparadorCarro::comparePorAno);
        System.out.println(carros);
        List<String> nomes = asList("Jesus", "Cristo", "PrincipeDaPaz", "ReiDeNebadon", "RabiDaGalileia");
        nomes.sort((s1, s2) -> s1.compareTo(s2));
        nomes.sort(String::compareTo);
        System.out.println(nomes);
        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringToInteger2 = Integer::parseInt;
        BiPredicate<List<String>, String> contains = (lista, elemento) -> lista.contains(elemento);
        BiPredicate<List<String>, String> contains2 = List::contains;
        System.out.println(stringToInteger2.apply("10"));
        System.out.println((boolean) contains2.test(nomes, "Jesus"));
//        Referencia a um construtor
        BiFunction<String, Integer, Carro> carroBiFunction = (s, i) -> new Carro(s, i);
        System.out.println((Carro) carroBiFunction.apply("Rosa", 1994));
        BiFunction<String, Integer, Carro> carroBiFunction2 = Carro::new;
        System.out.println((Carro) carroBiFunction2.apply("Rosa", 1994));

    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T e : list) {
            c.accept(e);
        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            result.add(f.apply(e));
        }
        return result;
    }
}
