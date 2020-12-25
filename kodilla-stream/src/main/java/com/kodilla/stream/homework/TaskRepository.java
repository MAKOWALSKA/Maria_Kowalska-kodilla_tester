package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("flying home for Christmas", LocalDate.of(2020, 12,22),LocalDate.of(2020,12,23)));
        tasks.add(new Task("New Year party", LocalDate.of(2020, 12, 30), LocalDate.of(2020,12,31)));
        tasks.add(new Task("Christmas lunch with family", LocalDate.of(2020, 12, 24), LocalDate.of(2020,12,24)));
        tasks.add(new Task("business meeting", LocalDate.of(2020, 12,19), LocalDate.of(2020,12,20)));
        return tasks;
    }
}
