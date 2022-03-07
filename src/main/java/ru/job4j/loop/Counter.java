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
}
