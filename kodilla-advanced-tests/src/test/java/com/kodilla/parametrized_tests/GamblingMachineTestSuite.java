package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    public final GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv", numLinesToSkip = 1)
    public void returnTrueWhileNumbersAreCorrect(int nr1, int nr2, int nr3, int nr4, int nr5, int nr6) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(nr1);
        numbers.add(nr2);
        numbers.add(nr3);
        numbers.add(nr4);
        numbers.add(nr5);
        numbers.add(nr6);
        assertTrue(gamblingMachine.howManyWins(numbers) <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/out.csv", numLinesToSkip = 1)
    public void returnZeroWhileNumbersOutOfRange(int nr1, int nr2, int nr3, int nr4, int nr5, int nr6) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(nr1);
        numbers.add(nr2);
        numbers.add(nr3);
        numbers.add(nr4);
        numbers.add(nr5);
        numbers.add(nr6);
        assertEquals(0, gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/missing.csv", numLinesToSkip = 1)
    public void returnExceptionWhileMissingNumber(int nr1, int nr2, int nr3, int nr4, int nr5) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(nr1);
        numbers.add(nr2);
        numbers.add(nr3);
        numbers.add(nr4);
        numbers.add(nr5);
        Throwable thrown = assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
        assertEquals("Wrong numbers provided", thrown.getMessage());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/negative.csv", numLinesToSkip = 1)
    public void returnExceptionWhileNegativeNumber(int nr1, int nr2, int nr3, int nr4, int nr5, int nr6) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(nr1);
        numbers.add(nr2);
        numbers.add(nr3);
        numbers.add(nr4);
        numbers.add(nr5);
        numbers.add(nr6);
        Throwable thrown = assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
        assertEquals("Wrong numbers provided", thrown.getMessage());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/zero.csv", numLinesToSkip = 1)
    public void returnExceptionWhileNumberZero(int nr1, int nr2, int nr3, int nr4, int nr5, int nr6) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(nr1);
        numbers.add(nr2);
        numbers.add(nr3);
        numbers.add(nr4);
        numbers.add(nr5);
        numbers.add(nr6);
        Throwable thrown = assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
        assertEquals("Wrong numbers provided", thrown.getMessage());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/duplicate.csv", numLinesToSkip = 1)
    public void returnExceptionWhileDuplicate(int nr1, int nr2, int nr3, int nr4, int nr5, int nr6) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(nr1);
        numbers.add(nr2);
        numbers.add(nr3);
        numbers.add(nr4);
        numbers.add(nr5);
        numbers.add(nr6);
        Throwable thrown = assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
        assertEquals("Wrong numbers provided", thrown.getMessage());
    }
}

