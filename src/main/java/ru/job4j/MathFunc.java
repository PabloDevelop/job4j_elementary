package ru.job4j;

public class MathFunc {

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static float func2(float x) {
        float y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        float result2 = MathFunc.func2(5F);
        float total = result1 + result2;
        int result3 = MathFunc.func1(100);
        System.out.println(total);
        System.out.println(result3);
    }
}