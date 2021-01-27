package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Random;

@Configuration
public class CarFactory {

    enum Season {WINTER, SPRING, SUMMER, AUTUMN}

    private Season season;
    private Car car;

    @Bean
    @Primary
    public Car selectCar() {
        Random random = new Random();
        int number = random.nextInt(4);
        switch (number) {
            case 0:
                season = Season.SUMMER;
                car = new Cabrio();
                break;
            case 1:
                season = Season.SPRING;
                car = new Sedan();
                break;
            case 2:
                season = Season.WINTER;
                car = new SUV();
                break;
            case 3:
                season = Season.AUTUMN;
                car = new Sedan();
                break;
        }
        return car;
    }
}
