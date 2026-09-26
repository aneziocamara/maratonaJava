/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.comportamentoporparametros.predicate;

import br.com.abc.javacore.comportamentoporparametros.classes.Carro;
import br.com.abc.javacore.comportamentoporparametros.interfaces.CarrosPredicate;
import java.util.Calendar;

/**
 *
 * @author Anezio
 */
public class CarrosDezAnosRecentesPredicate implements CarrosPredicate{

    @Override
    public Boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR)-10);
    }
    
}
