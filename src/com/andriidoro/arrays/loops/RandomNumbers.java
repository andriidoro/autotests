package com.andriidoro.arrays.loops;

import java.util.Random;

public class RandomNumbers
{
    public static void randomeNumbers()
    {
        Random ran = new Random();
        int[] arr3 = new int[15];
        System.out.println("Random array is: ");
         for (int i = 0; i < arr3.length; i++)
         {
             arr3[i] = ran.nextInt(10);
             System.out.print(arr3[i] + " ");
         }
        System.out.println();
        System.out.println("Even numbers are next: ");
        int numberOfEvens = 0;
        for (int b : arr3){
            if (b % 2 == 0){
                numberOfEvens++;
                System.out.print(b + " ");
            }
        }
        System.out.println();
        System.out.print("Quantity of even numbers - " + numberOfEvens);
    }
}
