/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.lambdas.test;

import br.com.abc.javacore.lambdas.classes.Carro;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author Anezio
 */
public class LambdaTest2 {

    public static void main(String[] args) {
        forEach(asList("Jesus", "Cristo", "PrincipeDaPaz"), (String s) -> System.out.println(s));
        List<Integer> list = map(asList("Jesus", "Cristo", "PrincipeDaPaz"), (String s) -> s.length());
        List<Carro> carros = asList(new Carro("Preto", 2020),
                new Carro("Cinza", 2010), new Carro("Branco", 1999), new Carro("Verde", 2019));
        List<String> listCores = map(carros, (Carro c) -> c.getCor());
        System.out.println(listCores);
        System.out.println(list);
        Predicate<Integer> pares = (Integer i) -> i % 2 == 0;
        IntPredicate impar = (int i) -> i % 2 == 1;
        System.out.println(pares.test(1000));
        System.out.println(impar.test(1000));
        Predicate<String> p = (String s) -> listCores.add(s);
        p.test("amarelo");
        Consumer<String> b = (String s) -> listCores.add(s);
        b.accept("AMARELO");
        Supplier<String> sup1 = () -> "Hi!";
        Supplier<Carro> sup2 = () -> new Carro("Preto", 2020);
//        System.out.println(listCores);
        System.out.println(sup1.get());
        System.out.println(sup2.get().getCor());
        System.out.println(sup2.get().getNome());
        System.out.println((int)sup2.get().getAno());
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
