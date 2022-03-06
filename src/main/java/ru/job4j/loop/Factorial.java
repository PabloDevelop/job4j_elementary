package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int multi = 1;
        int result;
        for (result = 1; result <= n; result++) {
                multi = result * multi;
            }
        return multi;
    }
}
