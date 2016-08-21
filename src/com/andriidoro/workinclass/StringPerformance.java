package com.andriidoro.workinclass;


public class StringPerformance {
    public static void main(String[] args) {
        StringPerformance.sring2();
        StringPerformance.string1();
    }

    public static void sring2() {

        long start = System.currentTimeMillis();
        StringBuilder c = new StringBuilder("start");
        //String c = "start";
        String b = "finish";
        for (long i = 0; i < 100000L; i++)
            c = c.append(b);
        // c = c.concat(b);
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0f); // для вывода целого значения через запятую(1000.0f)
    }

    public static void string1() {

        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        for (long i = 0; i < 100000L; i++)

            c = c.concat(b);
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0f); // для вывода целого значения через запятую(1000.0f)
    }
}

// сколько раз происходит процесс присоединения старт и финиш до условия 100000L
