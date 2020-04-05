package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public int check(int select) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            if (select < 4 && select > 0) {
                run = false;
            } else {
                System.out.println("Необходимо выбрать от 1 до 3 спичек, попробуйте еще раз:");
                select = Integer.valueOf(input.nextLine());
            }
        }
        return select;
    }

    public static void main(String[] args) {
        Matches matches = new Matches();
        Scanner input = new Scanner(System.in);
        int count = 0;
        int number = 11;
        while (number > 0) {
        if (count % 2 == 0) {
            System.out.println("Первый игрок берет спички:");
        } else {
            System.out.println("Второй игрок берет спички:");
        }
                int select = matches.check(Integer.valueOf(input.nextLine()));
                number = number - select;
                count++;

                System.out.println("Осталось " + number + " спичек" );
        }
        if (count % 2 == 0) {
            System.out.println("Победил второй игрок");
        } else {
            System.out.println("Победил первый игрок");
        }
    }
}