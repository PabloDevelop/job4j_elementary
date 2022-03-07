package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        int i;
        for (i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        int result;
        for (result = start; result <= finish; result++) {
            if (result % 2 == 0) {
                sum = sum + result;
            }
        }
        return sum;
    }
}