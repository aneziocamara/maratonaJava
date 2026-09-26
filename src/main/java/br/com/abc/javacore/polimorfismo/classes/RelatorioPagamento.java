 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.polimorfismo.classes;

/**
 *
 * @author Larissa
 */
public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente) {
//        System.out.println("Gerando relatorio para a gerencia:");
//        gerente.calculaPagamento();
//        System.out.println("Nome: " + gerente.getNome());
//        System.out.println("Salario deste mes: " + gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor) {
//        System.out.println("Gerando relatorio para os vendedores:");
//        vendedor.calculaPagamento();
//        System.out.println("Nome: " + vendedor.getNome());
//        System.out.println("Salario deste mes: " + vendedor.getSalario());
//    }
    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatorio:");
        funcionario.calculaPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario deste mes: " + funcionario.getSalario());
        if (funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario;
            System.out.println("Participacao nos lucros: " + g.getPnl());
        }
        if (funcionario instanceof Vendedor) {
            System.out.println("Total de vendas no periodo: " + ((Vendedor)funcionario).getTotalVendas());
        }
    }
}
