package Algoritm;

import java.util.Arrays;

public class IndevLabs {
    public static void main(String[] args) {
        int[] numbers = {5, 0, 1, 3, 2};
        System.out.println(findMissingNumber(numbers));
    }

    public static int findMissingNumber(int[] array) {
        // Sort the array to ensure the sequence is in order
        Arrays.sort(array);

        // Initialize the expected number in the sequence
        int expectedNumber = 0;

        // Iterate through the array to find the first missing number
        for (int i = 0; i < array.length; i++) {
            if (array[i] != expectedNumber) {
                return expectedNumber;
            }
            expectedNumber++;
        }

        // If no missing number is found, return the next expected number
        return expectedNumber;
    }
}
