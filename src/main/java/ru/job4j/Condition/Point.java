package ru.job4j.Condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = (x2 - x1);
        double rsl2 = (y2 - y1);
        double rsl3 = Math.sqrt(Math.pow(rsl1, 2) + Math.pow(rsl2, 2));
        return rsl3;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(0, 1, 0, 7);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (0, 1) to (0, 7) " + result2);
    }
}
