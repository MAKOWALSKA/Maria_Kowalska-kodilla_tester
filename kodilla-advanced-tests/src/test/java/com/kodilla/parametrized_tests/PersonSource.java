package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.8, 80.0), "Normal (healthy weight)"),
                Arguments.of(new Person(1.60, 90.0), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.74, 80.0), "Overweight")
        );
    }
}
