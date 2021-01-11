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
        String[] array = numbers.split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(array));
        Set<Integer> finalSet = set
                .stream()
                .map(Integer::parseInt).collect(Collectors.toSet());
        gamblingMachine.howManyWins(finalSet);
        assertDoesNotThrow(InvalidNumbersException::new);
        assertTrue(finalSet.size() <= 6);
        assertEquals(6, finalSet.size());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongNumbers.csv")
    public void shouldThrowException(String numbers) {
        String[] array = numbers.split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(array));
        List<Integer> list = new ArrayList<>();
        for (String s : set) {
            Integer parseInt = Integer.parseInt(s);
            list.add(parseInt);
        }
        Set<Integer> finalSet = new HashSet<>(list);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(finalSet));
    }
}

