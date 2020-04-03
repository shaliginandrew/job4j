package ru.job4j.tracker;
import java.util.Arrays;
import java.util.Random;
/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        this.items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item != null) {
                itemsWithoutNull[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        Item[] itemsEqualNames = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                itemsEqualNames[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(itemsEqualNames, size);
}

    public Item findById(String id) {
        // Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items[index] : null;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }


    public boolean replace(String id, Item item) {
       boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            items[index] = item;
            item.setId(id);
            result = true;
        }
         return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        int findIndex = indexOf(id);
        if (findIndex  != -1) {
            items[findIndex] = null;
            System.arraycopy(items, findIndex  + 1, items, findIndex, position - findIndex);
            items[position - 1] = null;
            position--;
            result = true;
        }
        return result;
    }

}

