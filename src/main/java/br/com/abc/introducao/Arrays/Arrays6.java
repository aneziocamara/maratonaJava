/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abc.introducao.Arrays;

/**
 *
 * @author anezi
 */
public class Arrays6 {

    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3};
        int[] arrInt2 = new int[3];
        int[] arrInt3 = new int[]{1, 2, 3};

//        int[][] dias = new int[3][];
//        dias[0] = new int[2];
//        dias[1] = new int[]{1, 2, 3};
//        dias[2] = new int[4];
        int[][] dias = {{0, 0}, {1, 2, 3}, {0, 0, 0, 0}};
//Qaul é a posição [1][2]?
// Resp: 3
        for (int[] arr : dias) {
            for (int num : arr) {
                System.out.println(num);
            }
        }

    }
}
