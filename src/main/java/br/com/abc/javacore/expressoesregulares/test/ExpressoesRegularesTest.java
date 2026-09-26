/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Larissa
 */
public class ExpressoesRegularesTest {

    public static void main(String[] args) {
//        \d - todos os digitos
//        \D - todos os nao digitos
//        \s - todos os espacos em branco \t \n \f \r
//        \S - todos os caracteres que nao estao em branco
//        \w - todos os caracteres de palavras a-z, A-Z, digitos e _
//        \W - todos os caracteres que nao for palavra
//        []
//        ? - zero ou uma ocorrencia
//        * - zero ou mais ocorrencias
//        + - uma ou mais ocorrencias
//        {n,m} - de n ate m ocorrencia
//        () - usado para agrupar
//        | - ou
//        $ - indica fim de linha
//        . - coringa (Ex: 1.3 -> 123 ou 1.3 ou 1 3 ou 1A3 ou 133 ou 1#3 ou etc).
//        ^ - [^abc] negacao
//Exemplos
//o(v|c)o -> ovo, oco
//maca(rr|c)ão -> macarrão, macacão

        int hexNum = 0x1;

//        String regex = "0[xX][0-9a-fA-F]+(\\s|$)";
//        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";

//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //ou "([\\w\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
//        String texto = "fulano@gmail.com, 102Abc@gmail.com, #@!abrao@mail.br, teste@gmail.com.co.br, teste@mail";

//        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
//        String texto = "05/10/2010 05/5/2015 1/1/01 01/05/95"; //  dd/MM/yyyy

        String regex = "proj([^,])+";
        String texto = "proj1.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto";



        System.out.println("Email valido? " + "#@!abrao@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Indice: 012345678901234567");
        System.out.println("Expressao: " + matcher.pattern());
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());

        }
        //System.out.println(hexNum);
    }
}
