/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class array_2chieu {

    public static void main(String[] args) {
        int[][] a = new int[2][3];// mang 2 hang 3 cot
        int[][] b = {
            {
                10, 20, 30
            }, {
                30, 40, 50
            }
        };
        for (int i = 0; i < 2; i++) {//hang
            for (int j = 0; j < 3; j++) {//cot
                System.out.print(b[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
