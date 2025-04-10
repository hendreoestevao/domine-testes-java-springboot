package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SimpleMathTest {
    SimpleMath simpleMath = new SimpleMath();
    @Test
    void testSum() {
        double firstNumber =6.2D;
        double secondNumber = 2D;
        Double actual = simpleMath.sum(6.2, 2D);
        Double expected = 8.2D;
        assertEquals(expected, actual,
                () -> firstNumber + " + " + secondNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual,"Did not produce expected result");
        assertNotNull(actual);
    }

    @Test
    void subtract() {
        Double actual = simpleMath.subtraction(8D, 2D);
        Double expected = 6D;
        assertEquals(actual, expected,"Did not produce expected result");
    }

    @Test
    void multiply() {
        Double actual = simpleMath.multiplication(8D, 2D);
        Double expected = 16D;

        assertEquals(actual, expected,"Did not produce expected result");
    }

    @Test
    void divide() {
        Double actual = simpleMath.division(8D, 2D);
        Double expected = 4D;
        assertEquals(actual, expected,"Did not produce expected result");
    }

    @Test
    void mean() {
        Double actual = simpleMath.mean(8D, 2D);
        Double expected = 5D;
        assertEquals(actual, expected,"Did not produce expected result");
    }

    @Test
    void squareRoot() {
        Double actual = simpleMath.squareRoot(8D);
        Double expected = 2.8284271247461903D;
        assertEquals(actual, expected,"Did not produce expected result");
    }
}
