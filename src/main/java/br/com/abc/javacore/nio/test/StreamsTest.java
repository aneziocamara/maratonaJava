/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.nio.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Larissa
 */
public class StreamsTest {

    public static void main(String[] args) {
//        gravador();
//        leitor();
//        gravadorTunado();
        leitorTunado();
    }

    private static void gravador() {
        byte[] dados = {65, 66, 67, 68, 69, 70};
        try (FileOutputStream gravador = new FileOutputStream("Pasta/stream.txt")) {
            gravador.write(dados);
            gravador.flush();
            System.out.println("Dados gravados com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void gravadorTunado() {
        byte[] dados = {65, 66, 67, 68, 69, 70};
        try (BufferedOutputStream gravadorBuffer = new BufferedOutputStream(new FileOutputStream("Pasta/stream.txt"), 4098)) {
            gravadorBuffer.write(dados);
            gravadorBuffer.flush();
            System.out.println("Dados gravados com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void leitor() {
        try (FileInputStream leitor = new FileInputStream("Pasta/stream.txt")) {
            int leitura;
            while ((leitura = leitor.read()) != -1) {
                byte b = (byte) leitura;
                System.out.print(", " + b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void leitorTunado() {
        try (BufferedInputStream leitorTunado = new BufferedInputStream(new FileInputStream("Pasta/stream.txt"), 4098)) {
            int leitura;
            while ((leitura = leitorTunado.read()) != -1) {
                byte b = (byte) leitura;
                System.out.print(", " + b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
