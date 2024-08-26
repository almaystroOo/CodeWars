package com.qubite.ClockCalculator;

public class Clock {
    public static int Past(int h, int m, int s) {
        h = (h >= 0 && h <= 23) ? h : 0;
        m = (m >= 0 && m <= 59) ? m : 0;
        s = (s >= 0 && s <= 59) ? s : 0;

        // Calculate total milliseconds
        int totalMilliseconds = (h * 3600000) + (m * 60000) + (s * 1000);

        return totalMilliseconds;
    }
}