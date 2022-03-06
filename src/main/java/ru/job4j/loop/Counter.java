package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        int result;
        for (result = start; result <= finish; result++) {
            sum = result + sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(5, 8));
        System.out.println(sum(3, 5));
        System.out.println(sum(3, 7));
    }
}
