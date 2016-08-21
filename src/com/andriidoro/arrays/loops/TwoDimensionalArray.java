package com.andriidoro.arrays.loops;

import java.util.Random;

public class TwoDimensionalArray {
    public static void twoDimArray() {
        int[][] arr4 = new int[8][5];
        Random random = new Random();
        int k = 0,i,j;
        int total = 0;
            System.out.println("Two dimensional random array is: ");
        for (i = 0; i < 8; i++){
           for (j = 0; j < 5; j++){
                arr4[i][j] = k;
                k++;
                arr4[i][j] = random.nextInt(1);
                arr4[i][j] = random.nextInt(999);
                total++;
               System.out.print(arr4[i][j] + " ");
           }
            System.out.println();
        }
        System.out.println();
        System.out.print("Total amount of values = " + total);
    }
}
