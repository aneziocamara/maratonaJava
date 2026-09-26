/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.abc.javacore.jdbc.interfaces;

import br.com.abc.javacore.jdbc.classes.Carro;
import java.util.List;

/**
 *
 * @author Anezio
 */
public interface CarroDAO {

    void save(Carro carro);

    void delete(Carro carro);

    void update(Carro carro);

    List<Carro> selectAll();

    List<Carro> searchByName(String nome);
    
}
