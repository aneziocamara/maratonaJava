/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.jdbc.classes;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;

/**
 *
 * @author Anezio
 */
public class MyRowSetListener implements RowSetListener{

    @Override
    public void rowSetChanged(RowSetEvent event) {
        System.out.println("O comando execute executado.");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        System.out.println("A linha foi atualizada ou inserida ou deletada.");
        if(event.getSource() instanceof RowSet){
            try {
                ((RowSet)event.getSource()).execute();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        System.out.println("O cursor se moveu.");
    }
    
}
