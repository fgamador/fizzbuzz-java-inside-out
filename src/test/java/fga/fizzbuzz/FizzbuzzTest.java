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

    private String fizzbuzz(int num) {
        if (num == 6)
            return "Fizz";

        return String.valueOf(num);
    }
}
