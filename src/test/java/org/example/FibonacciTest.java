package org.example;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class FibonacciTest {
    // Using @BeforeClass to initialize a shared Calculator instance for all tests
    static Calculator calculator;

    @BeforeClass
    public static void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testFibonacci0() {

        assertThat(calculator.fibonacci(0)).isEqualTo(0);
    }

    @Test
    public void testFibonacci1() {

        assertThat(calculator.fibonacci(1)).isEqualTo(1);
    }

    @Test
    public void testFibonacci2() {

        assertThat(calculator.fibonacci(2)).isEqualTo(1);
    }

    @Test
    public void testFibonacci5() {

        assertThat(calculator.fibonacci(5)).isEqualTo(5);
    }

    @Test
    public void testFibonacci10() {

        assertThat(calculator.fibonacci(10)).isEqualTo(55);
    }

    @Test
    public void testFibonacciNegative() {

        assertThatThrownBy(() -> calculator.fibonacci(-1)).isInstanceOf(IllegalArgumentException.class);
    }
}