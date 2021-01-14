package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kamil", new Teacher("Mark Twain")));
        students.add(new Student("Dominik", new Teacher("Alex Pushkin")));
        students.add(new Student("Jan"));
        students.add(new Student("Adam"));

        for (Student student : students) {
            String teacherName = student.getTeacher().map(Teacher::getName).orElse("<undefined>");
            System.out.println("Student: " + student.getName() + "; " + teacherName + ".");
        }
    }
}
