package com.codingExercise2;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        // Sort Numeric Array
        int[] numericArray = {5, 2, 8, 1, 3};
        System.out.println("Numeric array before sorting: " + Arrays.toString(numericArray));

        Arrays.sort(numericArray);

        System.out.println("Numeric array after sorting: " + Arrays.toString(numericArray));

        // Sort String Array
        String[] stringArray = {"banana", "apple", "orange", "grape", "pear"};
        System.out.println("String array before sorting: " + Arrays.toString(stringArray));

        Arrays.sort(stringArray);

        System.out.println("String array after sorting: " + Arrays.toString(stringArray));
    }
}
