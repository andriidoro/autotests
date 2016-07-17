package com.andriidoro.utils.convertors.Runner;

import com.andriidoro.utils.convertors.Convertor.PrimitiveConvertor;

public class Executor {
    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.charToInt();
        primitiveConvertor.intToChar();
        primitiveConvertor.floatToInt();

    }
}
