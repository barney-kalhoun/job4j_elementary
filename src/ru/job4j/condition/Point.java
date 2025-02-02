package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

        double first = x2 - x1;
        double second = y2 - y1;

        double rsl = Math.sqrt(Math.pow(first, 2) + Math.pow(second, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0,0) to (2,0) " + result);
    }
}
