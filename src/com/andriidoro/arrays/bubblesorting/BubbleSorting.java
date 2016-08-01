package com.andriidoro.arrays.bubblesorting;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int flag = 0;
        //int i =0;
        do {
            flag =0;
            int b = 0;
            for (int i = 0; i<9; i++)
              {
                if (arr[i] > arr[i + 1])
                {
                    b = arr[i + 1];
                    flag++;


                    arr[i + 1] = arr[i];
                    arr[i] = b;
                }
              }
            }
            while (flag!=0);

        }
}

// добавить строку вывода данных в строку. Найти куда ее поставить ??? О_о