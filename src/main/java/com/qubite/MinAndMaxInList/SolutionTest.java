package com.qubite.MinAndMaxInList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {

    private Kata kata = new Kata();

    @Test
    public void testExamples() {
        assertEquals(-49363254, kata.min(new int[]{-52, 56, 30, 29, -54,-49363254, 0, -110}));
        assertEquals(0, kata.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, kata.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, kata.min(new int[]{5}));
    }
}