package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= b; j++) {
                result *= i * j;
            }
        }
        if (a == 0 || b == 0) {
            result = 0;
        }
        return result;
    }
}


