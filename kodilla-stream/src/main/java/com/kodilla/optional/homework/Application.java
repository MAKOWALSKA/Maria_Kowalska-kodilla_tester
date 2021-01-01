package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kamil", new Teacher("Mark Twain")));
        students.add(new Student("Dominik", new Teacher("Alex Pushkin")));
        students.add(new Student("Jan", null));
        students.add(new Student("Adam", null));

        for (Student student : students) {
            Optional.ofNullable(student.getTeacher()).map(Teacher::getName).orElse("<undefined>");
            System.out.println("Student: " + student.getName() + "; " + student.getTeacher() + ".");
        }
    }
}
