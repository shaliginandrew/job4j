package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
    }

    public static void main(String[] args) {
        Battery first = new Battery(40);
        Battery second = new Battery(30);
        System.out.println("Заряд первой батареи: " + first.load + " Заряд второй батареи : " + second.load);
        first.exchange(second);
        System.out.println("Общий заряд:" + first.load);
    }
}
