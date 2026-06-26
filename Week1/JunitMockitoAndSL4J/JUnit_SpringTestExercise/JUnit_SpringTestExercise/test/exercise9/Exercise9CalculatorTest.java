package org.example.exercise9;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise9CalculatorTest {

    private final Exercise9Calculator calculator =
            new Exercise9Calculator();

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "5, 10, 15",
            "100, 200, 300",
            "-1, 1, 0"
    })
    void testAdd(
            int a,
            int b,
            int expected) {

        assertEquals(
                expected,
                calculator.add(a, b)
        );
    }
}