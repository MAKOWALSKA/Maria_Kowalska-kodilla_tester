package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private String answer;

    public FizzBuzzSteps() {

        Given("There is number 3", () -> this.number = 3);

        Given("There is number 50", () -> this.number = 50);

        Given("There is number 45", () -> this.number = 45);

        Given("There is number 4", () -> this.number = 4);

        When("I ask whether it's fizz or buzz", () -> {
            FizzBuzzChecker checker = new FizzBuzzChecker();
            this.answer = checker.fizzBuzzChecker(this.number);
        });

        Then("I should be given {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
