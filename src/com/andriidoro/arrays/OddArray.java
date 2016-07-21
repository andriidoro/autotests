package com.andriidoro.arrays;

public class OddArray {

    public static void main(String[] args) {
        int[] arr2 = new int[100];

       // for (int a = arr2.lenght() - 1; a > 0; a--)   // reverse putput

        for (int a=0; a> arr2.length; a++)    // for normal output
        {
            arr2[a] = a;
        }
        for (int b : arr2) {
            if (b % 2 != 0) {
                System.out.print(" " + b);

            }
        }

    }

}
