package org.example;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    // Using @BeforeClass to initialize a shared Calculator instance for all tests
    static Calculator calculator;

    @BeforeClass
    public static void setup() {
        calculator = new Calculator();
    }

    // Positive partition
    @Test
    public void testAdditionPositive() {

        assertEquals(8, calculator.add(5, 3));
    }

    // Negative partition
    @Test
    public void testAdditionNegative() {

        assertEquals(-2, calculator.add(3, -5));
    }

    // Valid division
    @Test
    public void testDivisionValid() {

        assertEquals(2.0, calculator.divide(10, 5), 0.001);
    }

    // Invalid division
    @Test
    public void testDivisionByZero() {

        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}