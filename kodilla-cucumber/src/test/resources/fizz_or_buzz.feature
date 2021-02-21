Feature: Fizz or buzz?

  Scenario Outline: The number is divisible by 3 or by 5, or by 3 and 5, or is not divisible by 3 nor 5
    Given There is number <number>
    When I ask whether it's fizz or buzz
    Then I should be given <answer>
    Examples:
      | number | answer     |
      | 3      | "Fizz"     |
      | 50     | "Buzz"     |
      | 45     | "FizzBuzz" |
      | 4      | "None"     |