package com.andriidoro.utils.convertors.calculator;

/**
 * Created by tafin on 18.07.2016.
 */
public class PostIncrement {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Origin a value " + a );
        System.out.println("Post-increment " + a++);
        System.out.println("After post-increment " + a);
        System.out.println("Pre-increment " + ++a);
        System.out.println("After pre-increment " + a);
    }
}
