package com.andriidoro.runners;

import com.andriidoro.utils.convertors.primitiveConvertorRunner.PrimitiveConvertor;

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
