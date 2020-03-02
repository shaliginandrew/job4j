package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int thrid) {
        int max12;
        int result = ((max12=(first>second)?first:second)>thrid)?max12:thrid;
        return result;
    }

    public static void main(String[] args) {
        int otv=MultiMax.max(10,5,3);
        System.out.println(otv);
    }
}
