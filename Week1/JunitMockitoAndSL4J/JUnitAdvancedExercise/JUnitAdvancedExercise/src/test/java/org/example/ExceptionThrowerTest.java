package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    ExceptionThrower obj = new ExceptionThrower();

    @Test
    void testException() {

        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> obj.throwException());

        assertEquals("Invalid Input", exception.getMessage());
    }
}