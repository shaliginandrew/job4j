package ru.job4j.condition;

public class Max {

    public static int max(int one, int two) {
        int result = one > two ? one : two;
        return result;
    }

    public static int max(int one, int two, int three) {
        int result = max(one, two) > three ? max(one, two) : three;
        return result;
    }

    public static int max(int one, int two, int three, int four) {
        int result = max(one, two, three) > four ? max(one, two, three) : four;
        return result;
    }

    public static void main(String[] args) {
        int rez1 = Max.max(7, 6);
        int rez2 = Max.max(9, 11, 11);
        int rez3 = Max.max(15, 11, 11, 12);
        System.out.println(rez1);
        System.out.println(rez2);
        System.out.println(rez3);
    }
}
