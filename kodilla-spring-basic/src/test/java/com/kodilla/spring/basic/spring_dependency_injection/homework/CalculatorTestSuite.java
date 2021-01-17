package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.home.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;


@SpringBootTest
public class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldReturnResultOfSummation() {
        double sum = bean.add(20.5,30.25);
        assertEquals(50.75, sum, 0.01);
    }

    @Test
    public void shouldReturnResultOfSubtraction() {
        double sub = bean.subtract(50.74,30.34);
        assertEquals(20.4, sub, 0.01);
    }

    @Test
    public void shouldReturnResultOfMultiplication() {
        double mult = bean.multiply(4,4);
        assertEquals(16, mult, 0.01);
    }

    @Test
    public void shouldReturnResultOfDivision() {
        double div = bean.divide(5,4);
        assertEquals(1.25, div, 0.01);
    }
}
