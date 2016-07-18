package com.andriidoro.utils.convertors.calculator;

import java.util.Scanner;

public class BiggerCircleArea
{
    public static final double PI = 3.14d;
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Please enter circle radius ");
        double r1 = scanner1.nextDouble();

        System.out.println("Please enter circle radius ");
        double r2 = scanner2.nextDouble();

        double area1 = PI*r1*r1;
        double area2 = PI*r2*r2;

       if ((r1 > r2)||(area1 > area2))
           System.out.println("Area 1 is bigger");
           else
           System.out.println("Area 2 is bigger");

     }
}

