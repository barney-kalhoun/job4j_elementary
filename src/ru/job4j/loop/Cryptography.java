package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.length() == 0) {
            return "empty";
        } else if (sb.length() < 5) {
            return s;
        } else {
            for (int i = 0; i < sb.length() - 4; i++) {
//                sb.replace(i, i, "#");
                sb.setCharAt(i, '#');
            }
        }
        return sb.toString();
    }
}
