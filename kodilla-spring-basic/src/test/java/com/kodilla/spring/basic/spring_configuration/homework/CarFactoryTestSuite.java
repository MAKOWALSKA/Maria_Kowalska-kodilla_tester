package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldCreateCarBean() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar");
        //When
        boolean hasLightsOn = car.hasHeadlightsTurnedOn(LocalTime.ofSecondOfDay(14));
        System.out.println(hasLightsOn);
        //Then
        Assertions.assertTrue(hasLightsOn);
    }

    @Test
    public void shouldChooseCarBasedOnSeason() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar");
        //When
        String type = car.getCarType();
        System.out.println(type);
        //Then
        List<String> possibleTypes = Arrays.asList("Cabriolet", "SUV", "Sedan");
        Assertions.assertTrue(possibleTypes.contains(type));
    }
}