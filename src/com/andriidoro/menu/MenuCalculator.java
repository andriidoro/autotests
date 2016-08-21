package com.andriidoro.menu;

import com.andriidoro.utils.calculator.BiggerNumber;
import com.andriidoro.utils.calculator.EvenOrOdd;
import com.andriidoro.utils.calculator.RadiusCircle;

import java.util.Scanner;

public class MenuCalculator  {
   // public static void main(String[] args) {
       public static void calculatorMenu(){
        double choice = 0;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Hello! =)" + "\n" + "Choose the number of tasks:" + "\n" + "1 - Circle Area" + "\n" +
                    "2 - Bigger Smaller Number" + "\n" + "3 - Even or Odd" + "\n" + "4 - Right Angeled Triangle\n" +
                     "0 - Exit\n");

            double numberOfChoice = sc.nextDouble();
            if (numberOfChoice == 1) {
                RadiusCircle.radiusCircle();
            } else if (numberOfChoice == 2) {
                BiggerNumber.biggerNumber();
            } else if (numberOfChoice == 3) {
                EvenOrOdd.evenOrOdd();
            } else if (numberOfChoice == 4) {
                RadiusCircle.radiusCircle();
            } else if (numberOfChoice == 0) {
                System.out.println("The programme abort");
            } else {
                System.out.println("You made incorrect choice. Try again!");
            }
            choice = numberOfChoice;
        }
        while (choice != 0);
    }
}
