/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.lambdas.test;

import br.com.abc.javacore.lambdas.classes.Carro;
import br.com.abc.javacore.lambdas.interfaces.CarrosPredicate;
import java.util.function.Predicate;



/**
 *
 * @author Anezio
 */
public class LambdaTest {
//    anonima, function, passada por aí, concisa
//    (Carro carro) -> carro.getCor().equals("verde");
//    (String s) -> s.lenght();
//    (int a, int b) -> (sout(a+b));
    public static void main(String[] args) {
        CarrosPredicate carroPredicate = new CarrosPredicate() {
            @Override
            public Boolean test(Carro carro) {
             return carro.getCor().equals("verde");   
            }
        };
        System.out.println((boolean)carroPredicate.test(new Carro("verde", 2012)));
        
        CarrosPredicate carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");
        Predicate<Carro> carroPredicate3 = (Carro carro) -> carro.getCor().equals("verde");
        System.out.println((boolean)carroPredicate2.test(new Carro("verde",2014)));
        System.out.println((boolean)carroPredicate3.test(new Carro("verde",2026)));
        
        Runnable runnable = () -> System.out.println("Dentro do run!");
        runnable.run();
//        ou
        new Thread(runnable).start();
    }

}
