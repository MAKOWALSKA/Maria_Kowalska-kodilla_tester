package com.kodilla.spring.basic.spring_configuration.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class CarFactoryTestSuite {

    @Test
    public void TurnOnLightsTest() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("selectCar");
        //when
        boolean result = car.hasHeadlightsTurnedOn(LocalTime.of(22,0));
        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void TurnOffLightsTest() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("selectCar");
        //when
        boolean result = car.hasHeadlightsTurnedOn(LocalTime.of(11,0));
        //then
        Assertions.assertFalse(result);
    }
    @Test
    public void randomCarTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("selectCar");
        //When
        String type = car.getCarType();
        System.out.println(type);
        //Then
        List<String> possibleTypes = Arrays.asList("Cabrio", "SUV", "Sedan");
        Assertions.assertTrue(possibleTypes.contains(type));
    }

}
