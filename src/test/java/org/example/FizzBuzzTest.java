package org.example;

import org.junit.jupiter.api.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    @DisplayName("Testing the FizzBuzz game")
    void getString3ReturnFizz() {
        String expected = "Fizz";
        String actual = fizzBuzz.getString(3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getString5ReturnBuzz() {
        String expected = "Buzz";
        String actual = fizzBuzz.getString(5);
        Assertions.assertEquals(expected, actual);
    }

    @RepeatedTest(3)
    void getString15ReturnFizzBuzz() {
        String expected = "FizzBuzz";
        String actual = fizzBuzz.getString(15);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getString2Return2() {
        String expected = "2";
        String actual = fizzBuzz.getString(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getString3333ReturnFizz() {
        String expected = "Fizz";
        String actual = fizzBuzz.getString(3333);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getString3ReturnNotBuzz() {
        String unexpected = "Buzz";
        String actual = fizzBuzz.getString(3);
        Assertions.assertNotEquals(unexpected, actual);
    }

    @Test
    void getStringNoExceptionShouldBeThrown() {
        fizzBuzz.getString(3);
        Assertions.assertTrue(true);
    }

    @Test
    void getString5ShouldNotReturnFizz() {
        boolean actual;
        if (!fizzBuzz.getString(5).equals("Fizz")) {
            actual = false;
        } else actual = true;

        Assertions.assertFalse(actual);
    }
}