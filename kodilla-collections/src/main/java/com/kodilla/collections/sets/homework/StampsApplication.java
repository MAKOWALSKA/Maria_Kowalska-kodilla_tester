package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Patroni Polski", "25,25 X 36,25 m /m", "yes"));
        stamps.add(new Stamp("Polska Zobacz Wiecej", "25,25 X 36,25 m /m", "no"));
        stamps.add(new Stamp("Motyle", "25,25 X 36,25 m /m", "yes"));
        stamps.add(new Stamp("Polska Zobacz Wiecej", "25,25 X 36,25 m /m", "yes"));
        stamps.add(new Stamp("Polska Zobacz Wiecej", "25,25 X 36,25 m /m", "yes"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}

