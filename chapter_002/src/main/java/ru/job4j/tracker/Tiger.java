package ru.job4j.tracker;

public class Tiger extends Predator {

    public Tiger() {

    }

    public Tiger(String name) {
        super(name);
        name = "Tiger";
        System.out.println(name);
    }

}
