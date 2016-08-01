package com.andriidoro.arrays.strings;


public class EvenNumbersArray {
    public static void main(String[] args) {
      // int a = 0;
        int[] arr = new int[21];
        for (int a = 0; a < arr.length; a++)
        {
            arr[a] = a;
        }
        for (int a = 2; a < arr.length; a++)
        {
            if (arr[a] % 2 == 0){
                System.out.print(arr[a] + " ");             // для вывода в столбик

            }
        }
        System.out.println();

        for (int i = 2; i <arr.length ; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
