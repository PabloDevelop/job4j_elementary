package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl1;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(0, 1, 0, 7);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (0, 1) to (0, 7) " + result2);
    }
}
