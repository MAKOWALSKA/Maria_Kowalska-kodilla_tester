package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;
import java.time.LocalTime;

@Component
public class SUV implements Car{

    public boolean hasHeadlightsTurnedOn(LocalTime hour) {
        return !(!hour.isAfter(LocalTime.of(20, 00)) && !(hour.isBefore(LocalTime.of(6, 00))));
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}