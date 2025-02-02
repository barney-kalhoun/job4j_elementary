package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index;
                for (int j = index + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        int notNullIndex = j;
                        SwitchArray.swap(array, nullIndex, notNullIndex);
                        break;
                    }
                }
            }
            System.out.println(array[index] + " ");
        }
        return array;
    }
}
