package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> SchoolDirectory = new HashMap<>();
        Principal Leonardo = new Principal("Leonardo", "Żółw");
        Principal Donatello = new Principal("Donatello", "Żółw");
        Principal Michelangelo = new Principal("Michelangelo", "Żółw");
        Principal Raphael = new Principal("Raphael", "Żółw");

        School LeonardoSchool = new School("Swords", 20,30);
        School DonatelloSchool = new School("Bo", 40,20);
        School MichelangeloSchool = new School("Nunchaku", 30, 5, 10);
        School RaphaelSchool = new School("Sai", 5, 20, 15);

        SchoolDirectory.put(Leonardo, LeonardoSchool);
        SchoolDirectory.put(Donatello, DonatelloSchool);
        SchoolDirectory.put(Michelangelo, MichelangeloSchool);
        SchoolDirectory.put(Raphael, RaphaelSchool);

        for (Map.Entry<Principal, School> principalEntry : SchoolDirectory.entrySet())
            System.out.println("Principal " + principalEntry.getKey().getFirstname() + " " + principalEntry.getKey().getLastname() + ", " + "school name: " +  principalEntry.getValue().getSchoolName() + ", pupils number: " +
                    principalEntry.getValue().getSum());
    }
}

