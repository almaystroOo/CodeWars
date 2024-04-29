package com.qubite.TrimSpaces;

public class Kata {
    public static String noSpace(final String x) {
        //replace all Whitespaces  & blanks and breakLines with empty string.
        return x.replaceAll("\\s+","");
    }
}