package com.andriidoro.arrays.loops;

public class OddArray {

    public static void oddNumbers() {
        int[] arr2 = new int[40];
        for (int a = 1; a < arr2.length ; a++)   // for normal output
        {
            arr2[a] = a;
        }
        for (int b : arr2)
            if (b % 2 != 0)
            {
                System.out.print(b + " ");
            }
        System.out.println();

        for (int i = arr2.length-1; i >= 0; i--)
        {
            arr2[i] = i;
        }
        for ( int r : arr2)
            if (r % 2 != 0)
            {
            System.out.print(arr2.length-r + " ");
            }
    }
}
