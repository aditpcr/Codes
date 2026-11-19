package com.mycompany.kalkukppl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorBasicTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(5.0, calc.add(2, 3), 0.0001);
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, calc.subtract(3, 2), 0.0001);
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calc.multiply(2, 3), 0.0001);
    }

    @Test
    void testDivide() {
        assertEquals(2.5, calc.divide(10, 4), 0.0001);
    }
}
