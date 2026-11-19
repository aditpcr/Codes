package com.mycompany.kalkukppl;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol");
        }
        return a / b;
    }

    public long power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Pangkat tidak boleh negatif");
        }
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Faktorial tidak terdefinisi untuk bilangan negatif");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
