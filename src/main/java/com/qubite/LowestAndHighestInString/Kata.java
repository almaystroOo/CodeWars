package com.qubite.LowestAndHighestInString;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Kata {
    public static String highAndLow(String numbers) {
        // Code here or
        List<Integer> numberList = Arrays.stream(numbers.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int lowest = numberList.stream().min(Integer::compareTo).orElseThrow();
        int highest = numberList.stream().max(Integer::compareTo).orElseThrow();
        return highest + " " + lowest ;
    }
}