package com.andriidoro.utils.convertors.Calculator;

import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");

        int int1 = sc.nextInt();

        if (int1 % 2 == 0)
            System.out.println("Value is Even ");
        else
            System.out.println("Value is Odd");

    }
}
