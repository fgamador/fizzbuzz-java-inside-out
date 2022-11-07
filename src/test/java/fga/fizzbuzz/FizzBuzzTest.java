package fga.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void ordinaryNumberPrintsAsItself() {
        assertEquals("2", FizzBuzz.fizzbuzz(2));
    }

    @Test
    void multipleOfThreePrintsAsFizz() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(6));
    }

    @Test
    void multipleOfFivePrintsAsBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
    }

    @Test
    void multipleOfFifteenPrintsAsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(30));
    }
}
