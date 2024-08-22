package com.qubite.SumWithouthLowestOrHighest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    //test code
    @Test
    public void BasicTests() {
        assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 8, 10}));
        assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 123, 123}));
                assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 1, 123})

                );

    }
}