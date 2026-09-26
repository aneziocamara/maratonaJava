/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.streams.test;

import br.com.abc.javacore.streams.classes.Pessoa;
import static java.util.Arrays.asList;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 *
 * @author Anezio
 */
public class StreamTest4Reduce {

    public static void main(String[] args) {
        Optional<Integer> reduce = method().reduce((x, y) -> x + y);
        System.out.println(reduce.get());

        Integer soma = method().reduce(0, (x, y) -> x + y);
        System.out.println(soma);

        Optional<Integer> soma2 = method().reduce(Integer::sum);
        System.out.println(soma2.get());

        Optional<Integer> mult = method().reduce((x, y) -> x * y);
        System.out.println(mult.get());

        Integer mult2 = method().reduce(1, (x, y) -> x * y);
        System.out.println(mult2);

        Optional<Integer> max = method().reduce((x, y) -> x > y ? x : y);
        System.out.println(max.get());

        Optional<Integer> max2 = method().reduce(Integer::max);
        System.out.println(max2.get());

        Optional<Integer> min = method().reduce(Integer::min);
        System.out.println(min.get());

        Stream<Pessoa> streamPessoa = Pessoa.bancoDePessoas().stream();
        Optional<Double> somaSalario = streamPessoa.filter(p -> p.getSalario() > 4000)
                .map(Pessoa::getSalario)
                .reduce(Double::sum);
        System.out.println(somaSalario.get());

        Double somaDouble = Pessoa.bancoDePessoas().stream().filter(p -> p.getSalario() > 4000)
                .mapToDouble(Pessoa::getSalario)
                .sum();
        System.out.println(somaDouble);
        
        DoubleStream doubleStream = Pessoa.bancoDePessoas().stream().filter(p->p.getSalario() > 4000)
                .mapToDouble(Pessoa::getSalario);
        Stream<Double> doubleStream2 = doubleStream.boxed();
    }

    private static Stream<Integer> method() {
        return asList(1, 2, 3, 4, 5, 6).stream();
    }
}
