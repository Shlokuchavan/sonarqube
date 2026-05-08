package com.example;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testAddition() {
        int num1 = 10;
        int num2 = 20;

        int expected = 30; // Correct expected value

        int actual = num1 + num2;

        assertEquals(expected, actual);
    }

    public void testAdditionWithZero() {
        int num1 = 15;
        int num2 = 0;

        int expected = 15; // Correct expected value

        int actual = num1 + num2;

        assertEquals(expected, actual);
    }

    public void testNegativeNumbers() {
        int num1 = -5;
        int num2 = -10;

        int expected = -15; // Correct expected value

        int actual = num1 + num2;

        assertEquals(expected, actual);
    }
}
