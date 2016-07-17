package com.andriidoro.utils.convertors.Convertor;


import com.sun.org.apache.xpath.internal.SourceTree;

public class PrimitiveConvertor {
   // public static void main(String[] args) {

        public void floatToInt() {
            float float1 = 152;
            char char1 = (char) float1;
            System.out.println("Вводимое значение float " + float1 + " Выводимое значение char " + char1);
        }

    public  void charToInt() {
        char char1 = 'C';
        int int1 = (int) char1;
        System.out.println("Вводимое значение char " + char1 + " Выводимое значение int " + int1);
    }


    public void intToChar() {
        int int1 = 54;
        char char1 = (char) int1;
        System.out.println("Вводимое значение int " + int1 + " Выводимое значение char " + char1);
    }
//}
}

