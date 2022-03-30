package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    @DisplayName("Testing the FizzBuzz game")
    void threeShouldReturnFizz() {
        String expected = "Fizz";
        String actual = fizzBuzz.getString(3);
        Assertions.assertEquals(expected, actual);
    }

}
