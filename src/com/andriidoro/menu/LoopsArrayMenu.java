package com.andriidoro.menu;

import com.andriidoro.arrays.loops.*;

import java.util.Scanner;

public class LoopsArrayMenu {
    public static void loopsMenu() {

            int choice = 0;
            Scanner sc = new Scanner(System.in);

            System.out.println("Please choose the programme to start: \n" +
                    "1 - Randome numbers array\n" +
                    "2 - Odd number array\n" +
                    "3 - Even number array\n" +
                    "4 - MinMax number array\n" +
                    "5 - Two dimensional array\n");

        int numberOfChoice = sc.nextInt();
        choice = numberOfChoice;
        switch (choice) {

            case 1:
                    TwoDimensionalArray.twoDimArray();
                    break;
                case 2:
                    RandomNumbers.randomeNumbers();
                    break;
                case 3:
                    EvenNumbersArray.evenNumbers();
                    break;
                case 5:
                    OddArray.oddNumbers();
                    break;
                case 6:
                    MinMaxNumber.minMaxNubers();
                    break;
                default:
                    System.out.println("You made incorrect choice =(");
                    break;
            }

    }
}
