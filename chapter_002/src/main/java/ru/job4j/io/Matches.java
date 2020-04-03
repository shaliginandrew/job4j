package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 11;
        while (number > 0) {
            System.out.println("Первый игрок берет спички:");
            int select1 = Integer.valueOf(input.nextLine());
            if (select1 < 4) {
                number = number - select1;
                System.out.println("Осталось " + number + " спичек");
                if (number == 0) {
                    System.out.println("Победил первый игрок");
                    break;
                }
                System.out.println("Второй игрок берет спички:");
                int select2 = Integer.valueOf(input.nextLine());

                number = number - select2;
                System.out.println("Осталось " + number + " спичек");
                if (number == 0) {
                    System.out.println("Победил второй игрок");
                }
            } else {
                System.out.println("Можно взять от 1 до 3 спичек");
            }
        }
    }
}