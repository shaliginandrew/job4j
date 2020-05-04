package ru.job4j.collection;

import java.util.Comparator;

import static java.lang.Math.*;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        char[] charLeft = o1.toCharArray();
        char[] charRight = o2.toCharArray();
        for (int index = 0; index <= min(charLeft.length, charRight.length); index++) {
            if (charRight[index] != charLeft[index]) {
                return Character.compare(charRight[index], charLeft[index]);
            }
        }
        return o1.length() - o2.length();
    }
}