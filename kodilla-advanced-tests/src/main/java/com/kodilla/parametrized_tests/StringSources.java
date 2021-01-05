package com.kodilla.parametrized_tests;

import java.util.stream.Stream;

public class StringSources {

    static Stream<Arguments> shouldCalculateStringLengthWithoutSpaces() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("OtHEr ", 5),
                Arguments.of("E V e n t", 5),
                Arguments.of("null ", 4),
                Arguments.of("A", 1)
        }
    }
}
