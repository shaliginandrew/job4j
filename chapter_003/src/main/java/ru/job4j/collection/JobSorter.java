package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("ABCD", 4),
                new Job("ABCD", 1),
                new Job("ABC", 2),
                new Job("A", 0)
        );
        System.out.println(jobs);
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        Collections.sort(jobs, new JobIncreaseByName());
        System.out.println(jobs);
        Collections.sort(jobs, new JobIncreaseByPriority());
        System.out.println(jobs);
    }
}