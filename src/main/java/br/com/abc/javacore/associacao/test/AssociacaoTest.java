/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.associacao.test;

import br.com.abc.javacore.associacao.classes.Aluno;
import br.com.abc.javacore.associacao.classes.Local;
import br.com.abc.javacore.associacao.classes.Professor;
import br.com.abc.javacore.associacao.classes.Seminario;

/**
 *
 * @author anezi
 */
public class AssociacaoTest {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Andre Luiz", 27);
        Aluno aluno2 = new Aluno("Filomeno de Miranda", 38);
        
        Seminario seminario = new Seminario("Transicao Planetaria");
        Professor professor = new Professor("Allan Kardec", "Espiritualidades");
        Local local = new Local("Avenida das americas","Jardim Aeroporto");
        
        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);
   
        seminario.setProfessor(professor);
        //seminario.setLocal(local);
        //seminario.setAlunos(new Aluno[]{aluno,aluno2});
        
        Seminario[] semArray = new Seminario[1];
        semArray[0] = seminario;
        professor.setSeminarios(semArray);
        
        seminario.print();
        professor.print();
        aluno.print();
    }
}
