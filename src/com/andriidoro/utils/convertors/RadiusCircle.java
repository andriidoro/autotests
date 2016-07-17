package com.andriidoro.utils.convertors;
import java.util.Scanner;

public class RadiusCircle
{
    public static void Calculate()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius");
        double radius = scanner.nextDouble();
        System.out.println("Please enter pi value");
        double pi = scanner.nextDouble();

        double circleArea = pi*radius*radius;
        System.out.println("Area is" + circleArea);

    }
}
