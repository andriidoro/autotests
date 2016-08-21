package com.andriidoro.workinclass;

/**
 * Created by tafin on 04.08.2016.
 */
public class InclusiveExclusive3 {
    public static void main(String[] args) {                 // 0 1 2 3 4
        StringBuilder builder = new StringBuilder("start");  // s t a r t
        int charIndex = 3;  // номер символа

        builder.setCharAt(charIndex, 'a');  // значение
        System.out.println(builder.toString());
    }
}
// заменяет символ(букву) в слове на указаное значение