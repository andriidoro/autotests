package com.andriidoro.workinclass;


import java.util.Arrays;
import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        System.out.println("Enter words using comma delimiter");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(","); // разделитель

        System.out.println(splittedStringArray.length);
    }
}

/* считает количество элементов между разделителем ","

*/