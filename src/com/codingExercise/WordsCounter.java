package com.codingExercise;

import java.util.Scanner;

public class WordsCounter {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = sc.nextLine();

        int count=1;

        int string = text.length();
        for(int i=0;i<string;i++) {
            if(text.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println("The string contains " + count + " words.");


    }
}
