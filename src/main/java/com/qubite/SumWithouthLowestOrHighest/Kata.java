package com.qubite.SumWithouthLowestOrHighest;
import java.util.Arrays;

public class Kata {
    public static int sum(int[] numbers) {
        if (numbers == null) {
            return 0;
        } else if (numbers.length <= 1) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int j : numbers) {
            min = Math.min(j, min);
            max = Math.max(j, max);
        }

        final int mn = min;
        final int mx = max;

        // Use an array to keep track of whether min and max have been replaced
        final int[] minCount = {0};
        final int[] maxCount = {0};

        return Arrays.stream(numbers)
                .map(n -> {
                    if (n == mn && minCount[0] < 1) {
                        minCount[0]++;
                        return 0;
                    } else if (n == mx && maxCount[0] < 1) {
                        maxCount[0]++;
                        return 0;
                    } else {
                        return n;
                    }
                })
                .sum();
    }
}
