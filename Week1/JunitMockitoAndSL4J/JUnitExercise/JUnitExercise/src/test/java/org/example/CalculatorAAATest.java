package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup executed");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown executed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 4;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(9, result);
    }

    @Test
    public void testMultiplication() {

        // Arrange
        int a = 3;
        int b = 4;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(12, result);
    }
}