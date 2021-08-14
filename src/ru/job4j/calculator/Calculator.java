package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class Calculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOfSubtractionAndDivison(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double sumOfAllOperations(double first, double second) {
        return sum(first, second)
                + subtract(first, second)
                + multiply(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат 1 расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат 2 расчета равен: " + sumOfSubtractionAndDivison(10, 20));
        System.out.println("Результат 3 расчета равен: " + sumOfAllOperations(10, 20));
    }
}
