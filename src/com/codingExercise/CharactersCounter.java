package com.codingExercise;

import java.util.Scanner;

public class CharactersCounter {
    public static void main(String[] args) {

        Scanner string = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = string.nextLine();

        int upper = 0;
        int lower = 0;
        int number = 0;

        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
        }

        System.out.println("Lower case letters: " + lower);
        System.out.println("Upper case letters: " + upper);
        System.out.println("Number: " + number);
    }
}
