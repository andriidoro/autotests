package com.andriidoro.utils.convertors.calculator;

import java.util.Scanner;

public class AskUserWhileDo {
    public static void main(String[] args)    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value a and b");
      // int a = (int) scanner.nextDouble();
      //  int b = (int) scanner.nextDouble();
       int a = scanner.nextInt();
       int b = scanner.nextInt();
        if (a > b){
            do { a = a - 1;   // можно использовать команду а-- (уменьшение значенияна 1 еденицу)
                 System.out.println("Value a is " + a + " Value b is " + b);
            } while ( a > b );
            System.out.println("Value a is equal to b =) ");
        } else {
            System.out.println("Value a is not equal to b =(");
        }
    }
}

