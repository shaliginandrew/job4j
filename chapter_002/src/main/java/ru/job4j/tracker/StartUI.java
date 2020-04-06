package ru.job4j.tracker;


public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Новая заявка создана");
    }

    public static void listOfAllItem(Input input, Tracker tracker) {
        System.out.println("=== List of all Items ====");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : tracker.findAll()) {
                System.out.println("id:" + item.getId() + ", name:" + item.getName());

            }
        } else {
            System.out.println("Список пуст");
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name for replace: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Замена произведена");
        } else {
            System.out.println("Замена не произведена, заявка с id:" + id + " не найдена");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена");
        } else {
            System.out.println("Заявка с id:" + id + " не найдена");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Найдена заявка:" + item.getName());
        } else {
            System.out.println("Заявка не найдена");
        }
    }

    public static void findItemsByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : tracker.findByName(name)) {
                System.out.println("id:" + item.getId() + ", name:" + item.getName());
            }
        } else {
            System.out.println("=== Заявка не найдена ===");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf( input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
           } else if (select == 1) {
                StartUI.listOfAllItem(input, tracker);
           } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
           } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
           } else if (select == 4) {
                StartUI.findItemById(input, tracker);
           } else if (select == 5) {
                StartUI.findItemsByName(input, tracker);
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
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}