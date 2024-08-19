package com.qubite.SquareFunction;

import java.util.Arrays;

public class Kata {
    public static int squareSum(int[] n) {
        return Arrays.stream(n)
                .map(j -> j * j) // Square each element
                .sum(); // Sum them up
    }
}
// public class Kata
//  {
//   public static int squareSum(int[] n)
//   { 
//    //Your Code
//     int sum=0;
//     for(int j : n){
//      sum +=(j*2);
//     }
//     return sum;
//   }
//  }