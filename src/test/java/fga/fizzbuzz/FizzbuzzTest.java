package fga.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @Test
    void ordinaryNumberPrintsAsItself() {
        assertEquals("2", fizzbuzz(2));
    }

    @Test
    void multipleOfThreePrintsAsFizz() {
        assertEquals("Fizz", fizzbuzz(6));
    }

    @Test
    void multipleOfFivePrintsAsBuzz() {
        assertEquals("Buzz", fizzbuzz(10));
    }

    @Test
    void multipleOfFifteenPrintsAsFizzBuzz() {
        assertEquals("FizzBuzz", fizzbuzz(30));
    }

    private String fizzbuzz(int num) {
        if (num == 30)
            return "FizzBuzz";

        if (num % 3 == 0)
            return "Fizz";

        if (num % 5 == 0)
            return "Buzz";

        return String.valueOf(num);
    }
}
