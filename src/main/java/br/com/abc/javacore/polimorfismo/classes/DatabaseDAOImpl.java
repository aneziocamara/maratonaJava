/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.polimorfismo.classes;

/**
 *
 * @author anezi
 */
public class DatabaseDAOImpl implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando as informacoes no banco de dados.");
    }
}
