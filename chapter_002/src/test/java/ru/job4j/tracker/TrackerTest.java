package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }


    @Test
    public void whenfindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test2");

        Item[] expected = new Item[1];
        Item[] result =  tracker.findByName("test2");
        assertThat(expected, is(result));
    }



}