package ru.job4j.io;

import java.util.Scanner;

public class Matches {

public int check(int select) {
    Scanner input = new Scanner(System.in);
    boolean run = true;
    while (run) {
    if (select < 4 && select > 0) {
       run = false;
    }  else {
       System.out.println("Необходимо выбрать от 1 до 3 спичек, попробуйте еще раз:");
         select = Integer.valueOf(input.nextLine());
    }
    }
    return select;
}

    public static void main(String[] args) {
        Matches matches = new Matches();
        Scanner input = new Scanner(System.in);

        int number = 11;
        while (number > 0) {
            System.out.println("Первый игрок берет спички:");
            int first = matches.check(Integer.valueOf(input.nextLine()));
            number = number - first;
            System.out.println("Осталось " + number + " спичек");
            if (number == 0) {
                System.out.println("Победил первый игрок");
                break;
            }
            System.out.println("Второй игрок берет спички:");
            int second = matches.check(Integer.valueOf(input.nextLine()));
            number = number - second;
            System.out.println("Осталось " + number + " спичек");
            if (number == 0) {
                System.out.println("Победил второй игрок");
                break;
            }
        }
    }
}