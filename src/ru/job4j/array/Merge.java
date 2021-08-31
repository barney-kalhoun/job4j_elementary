package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
//        int size = 0;
//        if (left[left.length - 1] < right[0]) {
//            for (int i = 0; i < left.length; i++) {
//                rsl[i] = left[i];
//                size++;
//            }
//            for (int i = 0; i < right.length; i++) {
//                rsl[left.length + i] = right[i];
//                size++;
//            }
//        }

        int pos = 0;
        for (int k : left) {
            rsl[pos] = k;
            pos++;
        }

        for (int i : right) {
            rsl[pos] = i;
            pos++;
        }

//        return Arrays.copyOf(rsl, size);
        return rsl;
    }

}
