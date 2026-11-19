package com.mycompany.kalkukppl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorFullTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    // ===== Operasi dasar =====
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

    @Test
    void testDivideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }

    // ===== Power =====
    @ParameterizedTest
    @CsvSource({"2,3,8", "5,0,1", "3,1,3", "0,5,0"})
    void testPower(int base, int exp, long expected) {
        assertEquals(expected, calc.power(base, exp));
    }

    @Test
    void testPowerNegativeExponentThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.power(2, -1));
    }

    // ===== Factorial =====
    @ParameterizedTest
    @CsvSource({"0,1", "1,1", "5,120", "10,3628800"})
    void testFactorial(int n, long expected) {
        assertEquals(expected, calc.factorial(n));
    }

    @Test
    void testFactorialNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-3));
    }

    // ===== Prime =====
    @ParameterizedTest
    @CsvSource({"-5,false", "0,false", "1,false", "2,true", "7,true", "9,false", "97,true"})
    void testIsPrime(int n, boolean expected) {
        assertEquals(expected, calc.isPrime(n));
    }
}
