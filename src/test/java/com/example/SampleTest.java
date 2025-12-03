package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Simple tests for the Sample class
 */
public class SampleTest {

    private Sample sample;

    @BeforeEach
    void setUp() {
        sample = new Sample();
    }

    @Test
    void testAddTwoNumbers() {
        int result = sample.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    void testAddWithZero() {
        int result = sample.add(5, 0);
        assertEquals(5, result);
    }

    @Test
    void testAddNegativeNumbers() {
        int result = sample.add(-2, 3);
        assertEquals(1, result);
    }
}
