package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;
import java.time.LocalTime;

@Component
public class Sedan implements Car {

    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        return time.isAfter(LocalTime.of(19,59)) || time.isBefore(LocalTime.of(6,00));
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
