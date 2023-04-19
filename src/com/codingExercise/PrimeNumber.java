package com.codingExercise;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        int temp;
        boolean isPrimeNumber=true;
        Scanner nr= new Scanner(System.in);
        System.out.println("Enter any number:");

        int number=nr.nextInt();

        for(int i=2;i<=number/2;i++) {
            temp=number%i;
            if(temp==0)
            {
                isPrimeNumber=false;
                break;
            }
        }

        if(isPrimeNumber)
            System.out.println(number + " is a Prime Number");
        else
            System.out.println(number + " is not a Prime Number");
    }
}
