/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.jdbc.test;

import br.com.abc.javacore.jdbc.classes.Carro;
import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.db.CarroDAOImpl;
import br.com.abc.javacore.jdbc.interfaces.CarroDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anezio
 */
public class CarroCRUD {
    private static Scanner teclado = new Scanner(System.in);
    private static CarroDAO dao = new CarroDAOImpl();
    
    public static void executar(int op){
        switch(op){
            case 1:
                inserir();
                break;
            case 2:
                atualizar();
                break;
            case 3:
                listar();
                break;
            case 4:
                System.out.println("Digite o nome do carro: ");
                buscarPorNome(teclado.nextLine());
                break;
            case 5:
                deletar();
                break;
               
        }
    }
    
    private static void inserir(){
        Carro c = new Carro();
        System.out.println("Nome do carro: ");
        c.setNome(teclado.nextLine());
        System.out.println("Placa: ");
        c.setPlaca(teclado.nextLine());
        System.out.println("Selecione um dos compradores abaixo: ");
        List<Comprador> compradorList = CompradorCRUD.listar();
        c.setComprador(compradorList.get(Integer.parseInt(teclado.nextLine())));
        dao.save(c);
    }
    
    private static void atualizar(){
        System.out.println("Selecione um dos carros abaixo: ");
        List<Carro> carroList = listar();
        Carro c = carroList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Novo nome ou enter para mante-lo.");
        String nome = teclado.nextLine();
        System.out.println("Nova placa ou enter para mante-la.");
        String placa = teclado.nextLine();
        if(!nome.isEmpty()){
            c.setNome(nome);
        }
        if(!placa.isEmpty()){
            c.setPlaca(placa);
        }
        dao.update(c);
    }
    
    private static List<Carro> listar(){
        List<Carro> carroList = dao.selectAll();
        for(int i = 0; i < carroList.size(); i++){
            Carro c = carroList.get(i);
            System.out.println("["+i+"] "+c.getNome()+" "+c.getPlaca()+" "+c.getComprador().getNome());
        }
        return carroList;
    }
    
    public static void deletar(){
        System.out.println("Selecione um dos carros abaixo para deleta-lo. ");
        List<Carro> carroList = listar();
        int index = Integer.parseInt(teclado.nextLine());
        System.out.println("Tem certeza? S/N ");
        String op = teclado.nextLine();
        if(op.startsWith("s"))
            dao.delete(carroList.get(index));
    }
    
    private static void buscarPorNome(String nome){
        List<Carro> carroList = dao.searchByName(nome);
        for(int i = 0; i < carroList.size(); i++){
            Carro c = carroList.get(i);
            System.out.println("["+i+"] "+c.getNome()+" "+c.getPlaca()+" "+c.getComprador().getNome());
        }
    }
}
