package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int multi = 1;
        for (int i = 2; i <= n; i++) {
                multi = multi * i;
            }
        return multi;
    }
}
