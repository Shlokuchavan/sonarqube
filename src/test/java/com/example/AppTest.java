package com.example;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testAddition() {
        int num1 = 10;
        int num2 = 20;

        int expected = 25; // Wrong expected value (intentional failure)

        int actual = num1 + num2;

        assertEquals(expected, actual); // This test will fail
    }

    public void testAdditionWithZero() {
        int num1 = 15;
        int num2 = 0;

        int expected = 10; // Wrong expected value (intentional failure)

        int actual = num1 + num2;

        assertEquals(expected, actual); // This test will fail
    }

    public void testNegativeNumbers() {
        int num1 = -5;
        int num2 = -10;

        int expected = -20; // Wrong expected value (intentional failure)

        int actual = num1 + num2;

        assertEquals(expected, actual); // This test will fail
    }
}
