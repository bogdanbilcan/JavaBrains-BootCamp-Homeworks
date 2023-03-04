package io.javabrains.javabasics;

import java.util.ArrayList;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int sum = 0;
        double avg = 0;
        int max = numbers[0];
        for (int number : numbers) {
            sum += number;
            if (max < number)
                max = number;
        }
        avg = (double) sum / numbers.length;

        System.out.println("sum = " + sum);
        System.out.println("max = " + max);
        System.out.println("avg = " + avg);

    }
}
