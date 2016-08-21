package com.andriidoro.arrays.loops;

import java.util.Random;

public class MinMaxNumber
{
    public static void minMaxNubers()
    {
        Random ram = new Random();
        System.out.println("Random array is: ");
        int[] arr3 = new int[50];
        for (int i = 0; i < arr3.length; i++)
        {
            arr3[i] = ram.nextInt(15);
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        int maxIndex = 0;
        System.out.println("Max value is: ");
        for (int b : arr3){
            if (arr3[b] > maxIndex)
                maxIndex = arr3[b];
          }
        System.out.print(maxIndex + " ");
        System.out.println();

        int minIndex = 0;
        System.out.println("Min value is: ");
        for (int b : arr3){
            if (arr3[b] < minIndex)
                minIndex = arr3[b];
        }
        System.out.print(minIndex + " ");

    }
}





