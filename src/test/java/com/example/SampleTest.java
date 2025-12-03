package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Sample class using JUnit 5 (Jupiter)
 * This demonstrates how to write tests that will be executed
 * by the Jenkins declarative pipeline.
 */
@DisplayName("Sample Class Tests")
public class SampleTest {

    private Sample sample;

    /**
     * Setup method - runs before each test
     * This creates a fresh Sample instance for each test
     */
    @BeforeEach
    void setUp() {
        sample = new Sample();
    }

    // ===== Addition Tests =====
    @Test
    @DisplayName("Should correctly add two positive numbers")
    void testAddPositiveNumbers() {
        int result = sample.add(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    @DisplayName("Should correctly add a positive and negative number")
    void testAddMixedNumbers() {
        int result = sample.add(5, -3);
        assertEquals(2, result, "5 + (-3) should equal 2");
    }

    @Test
    @DisplayName("Should correctly add zero")
    void testAddWithZero() {
        int result = sample.add(5, 0);
        assertEquals(5, result, "5 + 0 should equal 5");
    }

    // ===== Subtraction Tests =====
    @Test
    @DisplayName("Should correctly subtract two positive numbers")
    void testSubtractPositiveNumbers() {
        int result = sample.subtract(10, 3);
        assertEquals(7, result, "10 - 3 should equal 7");
    }

    @Test
    @DisplayName("Should correctly handle negative results")
    void testSubtractNegativeResult() {
        int result = sample.subtract(3, 10);
        assertEquals(-7, result, "3 - 10 should equal -7");
    }

    // ===== Multiplication Tests =====
    @Test
    @DisplayName("Should correctly multiply two positive numbers")
    void testMultiplyPositiveNumbers() {
        int result = sample.multiply(4, 5);
        assertEquals(20, result, "4 * 5 should equal 20");
    }

    @Test
    @DisplayName("Should return zero when multiplying by zero")
    void testMultiplyByZero() {
        int result = sample.multiply(5, 0);
        assertEquals(0, result, "5 * 0 should equal 0");
    }

    // ===== Greeting Tests =====
    @Test
    @DisplayName("Should return correct greeting message")
    void testGreetWithName() {
        String result = sample.greet("World");
        assertEquals("Hello, World!", result, "Should return proper greeting");
    }

    @Test
    @DisplayName("Should handle empty string in greeting")
    void testGreetWithEmptyString() {
        String result = sample.greet("");
        assertEquals("Hello, !", result, "Should handle empty name");
    }

    @Test
    @DisplayName("Should not return null for greeting")
    void testGreetNotNull() {
        String result = sample.greet("Jenkins");
        assertNotNull(result, "Greeting should not be null");
    }
}
