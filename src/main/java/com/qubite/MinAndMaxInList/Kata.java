package com.qubite.MinAndMaxInList;//

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata {

    public int min(int[] list) {
        int min = list[0];
        //Arrays.stream(list).
        for (int j : list) {
            if (j < min) {
                min = j;
            }
        }
        return min;
       // return ((String) min));
    }

    public int max(int[] list) {
        int max = list[0];
        for (int j : list) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    @Test
    public void testExamples() {
        assertEquals(-49363254, min(new int[]{-52, 56, 30, 29, -54,-49363254, 0, -110}));
        assertEquals(0,min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, min(new int[]{5}));
    }
}

