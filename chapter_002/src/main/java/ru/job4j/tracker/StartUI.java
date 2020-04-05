package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
           } else if (select == 1) {
                System.out.println("=== List of all Items ====");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                for (Item item : tracker.findAll()) {
                    System.out.println("id:" + item.getId() + ", name:" + item.getName());

                }
                } else {
                    System.out.println("Список пуст");
                }
           } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                //заявка с id не найдена
                System.out.print("Enter name for replace: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.print("Замена произведена");
                } else {
                    System.out.print("Замена не произведена");
                }



             }  else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                System.out.println("Найдена заявка:" + item.getName());
                if (tracker.delete(id)) { //true false
                    System.out.println("Заявка удалена");
                } else {
                    System.out.println("Заявка с id = " + id + " не найдена");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Найдена заявка:" + item.getName());
                } else {
                    System.out.println("Заявка не найдена");
                }
           } else if (select == 6) {
                  run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu:");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("6. Exit Program");

       // добавить остальные пункты меню.
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().showMenu();
        new StartUI().init(scanner, tracker);

    }
}