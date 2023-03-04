package io.javabrains.javacollections;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExercise {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = 0;
        for (Integer x : intList) {
            sum += x;
        }
        System.out.println("sum = " + sum);
    }
}
