package ru.job4j.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "=== List of all Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : tracker.findAll()) {
                System.out.println("id:" + item.getId() + ", name:" + item.getName());

            }
        } else {
            System.out.println("Список пуст");
        }
        return true;
    }
}
