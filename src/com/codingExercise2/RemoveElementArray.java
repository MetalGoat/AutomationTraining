package com.codingExercise2;

import java.util.Arrays;
public class RemoveElementArray {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int elementToRemove = 3;

        // Find the position of the element in the array
        int removedIndex = -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == elementToRemove) {
                removedIndex = i;
                break;
            }
        }

        if (removedIndex == -1) {
            System.out.println("Element not found in the array.");
            return;
        }

        // Remove the element and shift remaining elements
        int[] newArray = new int[myArray.length - 1];
        int newIndex = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (i != removedIndex) {
                newArray[newIndex] = myArray[i];
                newIndex++;
            }
        }

        int removedElement = myArray[removedIndex];
        System.out.println("Array before element removal: " + Arrays.toString(myArray));
        System.out.println("Removed element is: " + removedElement);
        System.out.println("Position of the removed element: " + removedIndex);
        System.out.println("Array after element removal: " + Arrays.toString(newArray));

        // Verify that the element no longer exists in the array
        boolean elementExists = false;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == elementToRemove) {
                elementExists = true;
                break;
            }
        }

        System.out.println("Element exists in the array: " + elementExists);
    }
}