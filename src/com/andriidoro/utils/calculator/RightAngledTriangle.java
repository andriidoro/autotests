package com.andriidoro.utils.calculator;

import java.util.Scanner;

public class RightAngledTriangle
{
    public static void rightAngleTri()
    {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first side of triangle:");
        double first = scanner.nextDouble();
        System.out.println("Input the second side of triangle:");
        double second = scanner.nextDouble();
        System.out.println("Input the third side of triangle:");
        double third = scanner.nextDouble();

        if ((first * first + second * second == third * third) || (second * second
        + third * third == first * first) || (third * third + first * first ==
        second * second)) {
            System.out.println("It is right-angled triangle!");
        }
        else if ((first + second < third) || (second + third < first) ||
        (third + first < second)) {
            System.out.println("Opps wrong triangle");
        }
        else {
            System.out.println("Opps. not right-angled triangle");
        }
    }
}



