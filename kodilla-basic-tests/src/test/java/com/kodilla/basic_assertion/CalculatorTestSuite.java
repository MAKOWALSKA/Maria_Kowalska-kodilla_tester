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
    public void testSquareForZero() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.square(0);

        // then
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testSquareForPositive() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.square(4);

        // then
        Assertions.assertEquals(16, result);
    }

    @Test
    public void testSquareForNegative() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.square(-4);

        // then
        Assertions.assertEquals(16, result);
    }
}


