package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Brad Pitt", new Teacher("Kamil Nowak")));
        students.add(new Student("Tiziano Rossi", new Teacher("Karol Smith")));
        students.add(new Student("Vladimir Putin", null));
        students.add(new Student("Pablo Picasso", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teacherName = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("Student: " + student.getName() + "; teacher: " + teacherName.getName() + ".");
        }
    }
}
