package com.qubite.CalculateAverage;

public class CalculateAverage {
    public static double find_average(int[] array) {
        if (array.length == 0) {
            return 0; // Handle empty array to avoid division by zero
        }

        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return (double) sum / array.length;
    }
}