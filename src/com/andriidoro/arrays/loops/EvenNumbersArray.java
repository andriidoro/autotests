package com.andriidoro.arrays.loops;


public class EvenNumbersArray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int a=0; a<arr.length; a++){
            arr[a] = a;
        }
        for (int b : arr){
            if (b % 2 == 0){
                System.out.println(b);
                System.out.println(" ");
            }
        }


    }


}
