package ru.job4j;

public class DataTypes {
    public static void main(String[] args) {

        int age = 18;
        System.out.println(((Object) age).getClass().getSimpleName());

        float length = 78.0332F;
        System.out.println(((Object) length).getClass().getSimpleName());

        boolean baby = true;
        System.out.println(((Object) baby).getClass().getSimpleName());
    }
}
