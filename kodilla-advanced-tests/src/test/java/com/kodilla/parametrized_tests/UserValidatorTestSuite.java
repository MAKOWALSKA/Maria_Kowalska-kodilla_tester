package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.UserValidator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private final UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"abc", "Dkwd0", "maria.kowalska87", "bla-bla-bla45", "d_j_angelo-comunello"})
    public void returnTrueWhileCorrectUserName(String userName) {
        assertTrue(validator.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"maria1234@mail.ru", "m.kowalska87@onet.pl", "maria_kowalska@test.com"})
    public void returnTrueWhileCorrectEmailAddress(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ab", "4", "maria_(*&^%$%*)", "zając", "мария", " "})
    public void returnFalseWhileWrongUserName(String userName) {
        assertFalse(validator.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ab@onet. pl", "!maria@gmail.com", "@gmail.com", "maria@gmail", "mąż@onet.pl", "ab @onet.pl", " "})
    public void returnFalseWhileWrongEmailAddress(String email) {
        assertFalse(validator.validateEmail(email));
    }
}
