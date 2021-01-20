package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarFactory {

    String season;

    @Bean
    public Car chooseCar() {
        Car car;
        Random rand = new Random();
        int num = rand.nextInt(4);
        switch (num) {
            case 1:
                season = "winter";
            case 2:
                season = "summer";
            case 3:
                season = "autumn";
            case 4:
                season = "spring";
        }

        if (season == "summer") {
            car = new Cabrio();
        } else if (season == "winter") {
            car = new SUV();
        } else {
            car = new Sedan();
        }
        return car;
    }
}


