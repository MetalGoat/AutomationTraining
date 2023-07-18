package com.codingExercise;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner string = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String text = string.nextLine();

        String reverse = "";

        for (int i = text.length()-1; i >=0 ; i--)
            reverse = reverse + text.charAt(i);

        if(text.equals(reverse))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

    }
}
