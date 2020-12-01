package com.kodilla.basic_assertion;

import kodilla.basic_assertion.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        Assertions.assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        Assertions.assertEquals(-3, subtractResult);
    }
    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = 6;
        int b = -4;
        int c = 0;
        int squareResult = calculator.square(a);
        Assertions.assertEquals(36, squareResult);
    } /*nie przyszlo mi nic lepszego do glowy niz wprowadzic wiecej zmiennych i uzywac ich po kolei w zaleznosci od tego co chcemy sprawdzic */
}

