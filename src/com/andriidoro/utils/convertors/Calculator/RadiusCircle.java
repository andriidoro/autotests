package com.andriidoro.utils.convertors.Calculator;

import java.util.Scanner;

public class RadiusCircle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter circle radius");
        double radius = scanner.nextDouble();

        System.out.println("Please enter pi value");
        double pi = scanner.nextDouble();

        double circleArea = pi*radius*radius;
        System.out.println("Area is " + circleArea);

    }
}