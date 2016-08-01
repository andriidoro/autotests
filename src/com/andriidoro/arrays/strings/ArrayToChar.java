package com.andriidoro.arrays.strings;

// надо перевести массив char в String

public class ArrayToChar
{
    public static void main(String[] args)
    {
        String stringToDisplay = "";
        char[] charArrayToString = {'a','b','c','d'};
        for (int i=0; i < charArrayToString.length; i++)
        {
         //  for (i = ;                                      // дописать обратный вывод данных в строке d,c,b,a
        stringToDisplay += charArrayToString[i];
        }
        System.out.println(stringToDisplay);
    }
}
