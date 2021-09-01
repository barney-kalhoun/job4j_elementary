package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] rsl = new int[n];
        rsl[0] = a;
        rsl[1] = b;
        int sum = 0;

        for (int i = 2; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum += rsl[j];
            }
            rsl[i] = sum;
            sum = 0;
        }
        return rsl;
    }
}
