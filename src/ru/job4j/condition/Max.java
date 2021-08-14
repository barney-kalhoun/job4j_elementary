package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {

        boolean conditionLeftGreater = left > right;
        boolean conditionEqual = left == right;

        int result = conditionLeftGreater ? left : (conditionEqual ? left : right);
        return result;
    }

}
