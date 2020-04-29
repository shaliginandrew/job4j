package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    PriorityQueue() {
        tasks.add(new Task("Zero", 0));
        tasks.add(new Task("One", 1));
        tasks.add(new Task("Three", 3));
        tasks.add(new Task("Four", 4));
    }

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;

        for (Task element : tasks) {
            if (element.getPriority() <= task.getPriority()) {
                index++;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }

    public void print() {
        for (Task value : tasks) {
            System.out.println(value.getPriority());
        }
    }

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.print();
        queue.put(new Task("Two", 2));
        System.out.println();
        queue.print();
    }
}
