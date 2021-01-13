package com.kodilla.optional.homework;

import java.util.Objects;
import java.util.Optional;

public class Student {

    private final String name;
    private final Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public Student(String name) {
        this.name = name;
        this.teacher = null;
    }

    public String getName() {
        return name;
    }

    public Optional<Teacher> getTeacher() {
        return Optional.ofNullable(teacher);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) &&
                Objects.equals(getTeacher(), student.getTeacher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getTeacher());
    }
}
