package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    public final GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv")
    public void shouldReturnValidCount(String numbers) throws InvalidNumbersException {
        // given
        String[] array = numbers.split(" ");
        Set<Integer> finalSet = parse(array);
        // when
        int result = gamblingMachine.howManyWins(finalSet);
        // then
        assertDoesNotThrow(InvalidNumbersException::new);
        assertTrue(result >=0 && result <=6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongNumbers.csv")
    public void shouldThrowException(String numbers) {
        // given
        String[] array = numbers.split(" ");
        Set<Integer> finalSet = parse(array);
        // when then
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(finalSet));
    }

    private Set<Integer> parse(String[] array) {
        return Arrays.stream(array)
                .map(Integer::parseInt).collect(Collectors.toSet());
    }
}

