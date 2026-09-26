/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.polimorfismo.test;

import br.com.abc.javacore.polimorfismo.classes.ArquivoDAOImpl;
import br.com.abc.javacore.polimorfismo.classes.GenericDAO;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author anezi
 */
public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
        List<String> lista = new LinkedList<>();
        lista.add("nome1");
        lista.add("nome2");
        lista.add("nome3");
        lista.add("nome4");
        lista.add("nome5");
        for(String nome : lista){
            System.out.println(nome);
        }
    }
}
