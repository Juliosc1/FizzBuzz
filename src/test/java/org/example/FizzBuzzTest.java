package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
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

    @Test
    void fiveShouldReturnBuzz() {
        String expected = "Buzz";
        String actual = fizzBuzz.getString(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @RepeatedTest(3)
    void threeAndFiveShouldReturnFizzBuzz() {
        String expected = "FizzBuzz";
        String actual = fizzBuzz.getString(15);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addThreeXFourTimes() {
        String expected = "Fizz";
        String actual = fizzBuzz.getString(3333);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void NoExceptionShouldBeThrown() {
        fizzBuzz.getString(3);
        Assertions.assertTrue(true);
    }

    @Test
    void fiveShouldNotReturnFizz() {
        boolean actual;
        if (!fizzBuzz.getString(5).equals("Fizz")) {
            actual = false;
        } else actual = true;

        Assertions.assertFalse(actual);
    }

    @Test
    void threeShouldNotGiveBuzz() {
        String unexpected = "Buzz";
        String actual = fizzBuzz.getString(3);
        Assertions.assertNotEquals(unexpected, actual);
    }

}