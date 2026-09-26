/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.comportamentoporparametros.test;

import br.com.abc.javacore.comportamentoporparametros.classes.Carro;
import br.com.abc.javacore.comportamentoporparametros.interfaces.CarrosPredicate;
import br.com.abc.javacore.comportamentoporparametros.predicate.CarrosCorVerdePredicate;
import br.com.abc.javacore.comportamentoporparametros.predicate.CarrosDezAnosRecentesPredicate;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Anezio
 */
public class CarroTest {

    private static List<Carro> filtraCarroVerde(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getCor().equals("verde")) {
                result.add(carro);
            }
        }
        return result;
    }

    private static List<Carro> filtraCarroPorCor(List<Carro> carros, String cor) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getCor().equals(cor)) {
                result.add(carro);
            }
        }
        return result;
    }

    private static List<Carro> filtraCarrosDezAnosFabricados(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10)) {
                result.add(carro);
            }
        }
        return result;
    }

    public static List<Carro> filtrarCarros(List<Carro> carros, CarrosPredicate carrosPredicate) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carrosPredicate.test(carro)) {
                result.add(carro);
            }
        }
        return result;
    }
    
    public static <T> List<T> filtrar(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Carro> carros = asList(new Carro("verde", 2021), new Carro("azul", 2022), new Carro("amarelo", 1994));
        List<Integer> numeros = asList(1,2,3,4,5,6,7,8,9,10);
//        System.out.println(filtraCarroVerde(carros));
//        System.out.println(filtraCarroPorCor(carros, "azul"));
        System.out.println(filtrarCarros(carros, new CarrosCorVerdePredicate()));
        System.out.println(filtrarCarros(carros, new CarrosDezAnosRecentesPredicate()));
        System.out.println(filtrarCarros(carros, new CarrosPredicate(){
            @Override
            public Boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
            
        }));
        System.out.println(filtrar(carros, (Carro carro) -> carro.getCor().equals("verde")));
        
        System.out.println(filtrar(numeros, (Integer integer) -> integer % 2 == 0));
    }
}
