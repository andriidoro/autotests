package com.andriidoro.workinclass;

/**
 * Created by tafin on 04.08.2016.
 */
import  java.util.Scanner;

public class CipherEnigma {
    public static void main(String[] args) {
        String normalText = "abcdefghjk123";
        String cipherText = "concatenator5";

        System.out.println("Please enter string to code");
        Scanner sc = new Scanner(System.in);
        String inputLetter = sc.nextLine();
        StringBuilder builder = new StringBuilder(inputLetter);

           for (int i = 0; i < inputLetter.length(); i++) {
               for (int j = 0; j < normalText.length(); j++) {
                   if (inputLetter.charAt(i) == normalText.charAt(j)){
                       builder.setCharAt(i, cipherText.charAt(j));
                       break;
                   }
               }
           }
        System.out.println(builder.toString());
    }
}
