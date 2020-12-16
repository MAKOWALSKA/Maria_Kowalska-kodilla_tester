package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Patroni Polski", "25,25 X 36,25 m /m", true));
        stamps.add(new Stamp("Polska Zobacz Wiecej", "25,25 X 36,25 m /m", false));
        stamps.add(new Stamp("Motyle", "25,25 X 36,25 m /m", true));
        stamps.add(new Stamp("Polska Zobacz Wiecej", "25,25 X 36,25 m /m", true));
        stamps.add(new Stamp("Polska Zobacz Wiecej", "25,25 X 36,25 m /m", false));

        if (stamps.size() == 4)
            System.out.println("OK");
                else {
            System.out.println("Something went wrong");
        }
    }
}



