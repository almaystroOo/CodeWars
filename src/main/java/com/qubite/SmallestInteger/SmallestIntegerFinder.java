
package com.qubite.SmallestInteger;
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int smallest = args[0];
        for (int j : args) {
            smallest = Math.min(j, smallest);
//             if (j < smallest) {  // 
//                 smallest = j;
//             }
        }
        return smallest;
    }
}
