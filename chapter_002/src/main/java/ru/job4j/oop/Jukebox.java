package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        }   else if (position == 2) {
            System.out.println("Спокойной ночи");
        }
    }

    public static void main(String[] args) {
        int position = 1;
        Jukebox song = new Jukebox();
        song.music(position);
    }
}
