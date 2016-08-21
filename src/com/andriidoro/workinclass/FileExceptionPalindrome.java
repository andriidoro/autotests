package com.andriidoro.workinclass;


public class FileExceptionPalindrome
{
    public static void main(String[] args)
    {
        String palindrome = "mom";
        StringBuilder builder = new StringBuilder(palindrome);
        builder.reverse();
        if (palindrome.equals(builder.toString())) System.out.println("palindrome");
           else
            System.out.println("not palindrome");
    }
}
