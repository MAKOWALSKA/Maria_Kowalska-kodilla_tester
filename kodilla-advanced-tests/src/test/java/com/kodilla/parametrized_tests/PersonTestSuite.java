package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.PersonSource#provideDataForTestingBMI")
    public void calculateBMIAndCompareToExampleData(Person person, String expected) {
        assertEquals(expected, person.getBMI());
    }
}

