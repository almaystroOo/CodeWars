package com.qubite.NumberOfSteps;

import java.util.Arrays;
import java.util.List;

public class Kata {
    public static int numberOfSteps(int num) {
        // check if num is even ? if devide by 2
        // need var to store n steps and var to hold working num
        // need to iterate with a flag ?
        int steps = 0;
        while(num>0){

            if(num % 2 ==0){
                num  = num / 2;

            } else {
                num-=1;
            }
            steps+=1;
//            else if(num % 2 > 0 && num !=0 ){
//                num--;
//                System.out.println(num);
//                steps++;
//                System.out.println(steps);
//            }else{
//                flag=false;
//            }

        }
//        }
        return steps;
        //  return num % 2 ==0 ?
    }
//    public static String noSpace(String numbers) {
//        // Code here or
//        List<Integer> number = Arrays.stream(numbers.split("\\D+")).
//                filter(s -> !s.isEmpty()).
//                map(Integer::parseInt).toList();
//        int lowest = number.stream().min(Integer::compareTo).orElseThrow();
//        int highest = number.stream().max(Integer::compareTo).orElseThrow();
//
//        // Return the result as a string in "highest lowest" format
//        return highest + " " + lowest;
////        final int[] lowest = {0};
////        final int[] highest = {0};
////        String output = number.stream().
////                map(n -> {
////                            if (lowest[0] < 1 || highest[0] < 1) {
////                                lowest[0] += n;
////                                highest[0] += n;
////                            } else if (lowest[0] > n || highest[0] < n) {
////                                lowest[0] = n;
////                                highest[0] = n;
////                            }
////                            return n;
////                        }
////                ).toString();
////
////        return Arrays.toString(highest);
//    }

    public static void main(String[] args) {
        //System.out.println(noSpace("1 2 34 23 45 454 34"));
        System.out.println(numberOfSteps(5));
    }
}

