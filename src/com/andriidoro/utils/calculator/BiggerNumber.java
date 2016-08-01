package com.andriidoro.utils.calculator;

import java.util.Scanner;


public class BiggerNumber {
    public static void biggerNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please imput value 1");
        int int1 = sc.nextInt();
       // System.out.println(int1);
        System.out.println("Please imput value 2");
        int int2 = sc.nextInt();
       // System.out.println(int2);
          if ( int1 > int2)
              System.out.println("Value 1 is bigger then value 2 " + "\n" + int1 + '>' + int2);
          else
              System.out.println("Value 2 is bigger then value 1 " + "\n" + int2 + '>' + int1 );

    }
}
