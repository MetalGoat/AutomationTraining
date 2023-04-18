package com.codingExercise;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int number;
        int reverse = 0;
        int result;

        Scanner nr =new Scanner(System.in);
        System.out.println("Enter a number:");
        number=nr.nextInt();

        while(number!=0)
        {
            result=number%10;
            reverse=(reverse*10)+result;
            number=number/10;
        }

        System.out.println("Reversed Number: " + reverse);
    }
}
