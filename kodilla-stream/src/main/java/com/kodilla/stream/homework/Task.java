package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {

    private final String name;
    private final LocalDate opened;
    private final LocalDate deadLine;

    public Task(String name, LocalDate opened, LocalDate deadLine) {
        this.name = name;
        this.opened = opened;
        this.deadLine = deadLine;
    }

    public String getName() {
        return name;
    }

    public LocalDate getOpened() {
        return opened;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return Objects.equals(getName(), task.getName()) &&
                Objects.equals(getOpened(), task.getOpened()) &&
                Objects.equals(getDeadLine(), task.getDeadLine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getOpened(), getDeadLine());
    }

}
