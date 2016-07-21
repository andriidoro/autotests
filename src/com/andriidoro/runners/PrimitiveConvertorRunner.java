package com.andriidoro.runners;

import com.andriidoro.utils.convertors.primitiveConvertor.PrimitiveConvertor;

public class PrimitiveConvertorRunner
{
    public static void main(String[] args)
    {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.charToInt();
        primitiveConvertor.intToChar();
        primitiveConvertor.floatToInt();

    }
}
