package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
    boolean rezultat=(((ab+ac)>bc)&&((ac+bc)>ab))&&((ab+bc)>ac);
    return rezultat;
    }
    public static void main(String[] args) {
        boolean otv=Triangle.exist(2.0,2.5,2.54);
        System.out.println(otv);
    }
}
