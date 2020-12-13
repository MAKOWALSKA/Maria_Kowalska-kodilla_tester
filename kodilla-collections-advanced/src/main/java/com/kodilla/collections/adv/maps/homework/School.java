package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> classrooms = new ArrayList<>();

    public School(String name, int ... classrooms) {
        for (int pupils : classrooms)
            this.classrooms.add(pupils);
        this.name = name;
    }

    public int getSum() {
        int sum = 0;
        for (int pupils : classrooms)
            sum += pupils;
        return sum;
    }

    public String getSchoolName() {
        return name;
    }

    @Override
    public String toString() {
        return "School{" +
                "pupils=" + classrooms +
                '}';
    }
}
