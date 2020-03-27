package ru.job4j.tracker;

public class Animal {

    String name;

    public Animal() {

    }

    public Animal(String name) {
        super();
        System.out.println(name);
    }

    public static void main(String[] args) {
        String name = "Animal";
        Tiger tiger = new Tiger(name);
    }
}


