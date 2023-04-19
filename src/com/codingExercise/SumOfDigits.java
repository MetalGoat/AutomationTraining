package com.codingExercise;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        int number;
        int sum = 0;

        Scanner nr = new Scanner(System.in);
        System.out.println("Enter a number:");

        number = nr.nextInt();

        while(number!=0){
            sum += number % 10;
            number = number / 10;
        }

        System.out.println("The sum of digits is: " + sum);
    }
}
