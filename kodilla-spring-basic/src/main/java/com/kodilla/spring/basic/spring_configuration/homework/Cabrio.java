package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;
import java.time.LocalTime;

@Component
public class Cabrio implements Car {

    public boolean hasHeadlightsTurnedOn(LocalTime hour) {
        if (hour.isBefore(LocalTime.of(6, 0))) if (hour.isAfter(LocalTime.of(00, 00))) return true;
        if (hour.isAfter(LocalTime.of(20, 0))) if (hour.isBefore(LocalTime.of(23, 59))) return true;
        return false;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
