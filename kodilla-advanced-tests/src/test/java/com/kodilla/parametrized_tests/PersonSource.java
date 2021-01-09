package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.8, 45.0), "Very severely underweight"),
                Arguments.of(new Person(1.7, 45.0), "Severely underweight"),
                Arguments.of(new Person(1.5, 40.0), "Underweight"),
                Arguments.of(new Person(2, 80.0), "Normal (healthy weight)"),
                Arguments.of(new Person(1.74, 80.0), "Overweight"),
                Arguments.of(new Person(1.9, 125.0), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.6, 100.0), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.7, 125.0), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.5, 112.0), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.8, 190.0), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.65, 175.0), "Obese Class VI (Hyper Obese)")
        );
    }
}
