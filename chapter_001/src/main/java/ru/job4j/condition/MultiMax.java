package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int thrid) {

        int max12=(first>second)?first:second;//выберем максимальное из первых двух
        int result = max12>thrid?max12:thrid;//и сравним с третьим
        return result;
    }

    public static void main(String[] args) {
        int otv=MultiMax.max(1,5,8);
        System.out.println(otv);
    }
}
