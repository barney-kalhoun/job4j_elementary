package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int daySalary = 0;
        int weekSalary = 0;

        for (int i = 0; i < 5; i++) {
            if (hours[i] > 0) {
                daySalary = 8 * 10 + (hours[i] - 8) * 15;
                weekSalary += daySalary;
            }
        }

        int weekendSalary = 0;
        for (int i = 5; i < 7; i++) {
            if (hours[i] > 0) {
                weekendSalary = hours[i] * 20;
                weekSalary += weekendSalary;
            }
        }
        return weekSalary;
    }
}
