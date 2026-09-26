/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.javacore.concorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

/**
 *
 * @author Anezio
 */
public class LinkedTransferQueueTest {

    public static void main(String[] args) throws InterruptedException {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Jesus"));
        tq.put("Cristo");
        System.out.println(tq.offer("Allan Kardec"));
        System.out.println(tq.offer("Allan Kardec", 1, TimeUnit.NANOSECONDS));
//         tq.transfer("Emmanuel");
        System.out.println(tq.tryTransfer("Allan Kardec"));
        System.out.println(tq.tryTransfer("Allan Kardec", 1, TimeUnit.SECONDS));

        System.out.println(tq.remainingCapacity());
        
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.poll(10, TimeUnit.MILLISECONDS));
        System.out.println(tq.remove());
        System.out.println(tq.take());
    }
}
