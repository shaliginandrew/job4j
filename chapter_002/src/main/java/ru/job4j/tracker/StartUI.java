package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select >= 0 && select < 7) {
                UserAction action = actions[select];
                run = action.execute(input, tracker);
            }
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu:");
            for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ListOfAllItem(),
                new ReplaceItem(),
                new DeleteItem(),
                new FindItemById(),
                new FindItemsByName(),
                new ExitProgram()
        };

        new StartUI().init(input, tracker, actions);
    }
}