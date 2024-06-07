package com.qubite.GrasshopperGradebook;
public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        int avr = (s1 + s2 + s3) / 3;

        if (avr >= 90) {
            return 'A';
        } else if (avr >= 80) {
            return 'B';
        } else if (avr >= 70) {
            return 'C';
        } else if (avr >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}