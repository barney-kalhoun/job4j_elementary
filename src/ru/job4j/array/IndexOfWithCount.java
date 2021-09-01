package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rsl = -1;
        int found = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                found++;
            }
            if (found == number) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}
