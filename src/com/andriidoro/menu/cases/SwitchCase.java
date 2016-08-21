package com.andriidoro.menu.cases;

import  java.util.Scanner;    // переделать под программу МЕНЮ из домашки
                             // использовать метод SWITCH

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Imput number fron 0 to 4");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("You enter number 1");
                break;
            case 2:
                System.out.println("Tou enter number 2");
                break;
            case 3:
                System.out.println("You enter number 3");
                break;
            case 4:
                System.out.println("You enter number 4");
                break;
            case 0: break;
            default:       // используеться для выполнения по умолчанию(!!Всегда пишется в конце программы!!)
                System.out.println("You entered incorrect choice");
        }

        }

    }

