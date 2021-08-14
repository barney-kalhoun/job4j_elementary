package ru.job4j;

public class DataTypesCasting {
    public static void main(String[] args) {

        System.out.println("С потерей данных:");

        long l = 129L;
        byte b = (byte) l;
        System.out.println("\n1 выражение");
        System.out.println("До: " + l);
        System.out.println("После: " + b);

        float f = 12358.7F;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println("\n2 выражение");
        System.out.println("До: " + (f + i));
        System.out.println("После: " + rsl);

        double d = 121.19;
        byte b2 = (byte) d;
        System.out.println("\n4 выражение");
        System.out.println("До: " + d);
        System.out.println("После: " + b2);

        System.out.println("\nБез потери данных:");

        char c = 45000;
        float f2 = c;
        System.out.println("\n3 выражение");
        System.out.println("До: " + (int) c);
        System.out.println("После: " + f2);

        short s = 1500;
        char c2 = (char) s;
        double d2 = c2;
        System.out.println("\n5 выражение");
        System.out.println("До: " + s);
        System.out.println("После: " + d2);
    }
}
