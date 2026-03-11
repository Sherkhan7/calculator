package org.example;

import org.junit.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LucasTest {
    // Using @BeforeClass to initialize a shared Calculator instance for all tests
    static Calculator calculator;

    @BeforeClass
    public static void setup() {
        calculator = new Calculator();
    }

    @Test(priority = 1, groups = {"valid"})
    public void testLucas0() {
        // test the base case for n=0
        assertEquals(calculator.lucas(0),2);
    }

    @Test(priority = 2, groups = {"valid"})
    public void testLucas1() {
        // test the base case for n=1
        assertEquals(calculator.lucas(1),1);
    }

    @Test(priority = 3, groups = {"valid"})
    public void testLucas5() {
        // test a non-base case for n=5
        assertEquals(calculator.lucas(5),11);
    }

    @Test(priority = 4, groups = {"invalid"})
    // test that an exception is thrown for negative input
    public void testLucasNegative() {
        try {
            calculator.lucas(-1);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}