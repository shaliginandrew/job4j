package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] == word[i]) {
                count++;
            }
        }
        if (count == pref.length) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[]{'H', 'e', 'l'};
        boolean result = startsWith(word, pref);
        System.out.println(result);
    }
}