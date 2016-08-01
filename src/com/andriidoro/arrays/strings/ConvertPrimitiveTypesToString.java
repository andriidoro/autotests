package com.andriidoro.arrays.strings;

public class ConvertPrimitiveTypesToString
{
    public static void main(String[] args)
    {
        String toInt = "15";                                // String to integer
        int intValue = Integer.valueOf(toInt);

        String toDouble = "1.5";
        double doubleValue = Double.valueOf(toDouble);

        String toLong = "1256";
        long longValue = Long.valueOf(toLong);

        String toBoolean = "false";
        boolean booleaValue = Boolean.valueOf(toBoolean);

        int backToString = 25;                                  // integer to string
        String integerValue = String.valueOf(backToString);

        //Integer intValue = new Integer(toInt);
        /*Double doubleValue = new Double();
        Long longValue = new Long();
        Boolean boolValue = new Boolean();
        */
        System.out.println(intValue);   // PRINT string to integer
        System.out.println(toDouble);
        System.out.println(toLong);
        System.out.println(toBoolean);
        System.out.println(backToString); // PRINT integer to string

    }
}