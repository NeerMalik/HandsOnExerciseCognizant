package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2,3);

        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(10,4);

        assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(5,6);

        assertEquals(30, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();

        int result = calculator.divide(20,4);

        assertEquals(5, result);
    }
}