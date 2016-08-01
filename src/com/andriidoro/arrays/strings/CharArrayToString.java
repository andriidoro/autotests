package com.andriidoro.arrays.strings;


import java.util.Arrays;

public class CharArrayToString {
    public static void main(String[] args) {
        String stringToDisplay = "";
        char[] charArrayToString = {'a','b','c','d',' ',' '};

        stringToDisplay = Arrays.toString(charArrayToString)
                .replace(",", "")  // remove the commas
                .replace("[", "")  // remove the right bracket
                .replace("]", "")  // remove the right bracket
                .replace(" ", "")  // remove the spaces
                .trim();           // trim empty calls at end
        System.out.println(stringToDisplay);
    }
}
