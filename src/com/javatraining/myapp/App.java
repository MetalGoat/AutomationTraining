package com.javatraining.myapp;

public class App {
    public static void main(String[] args) {
        System.out.println("Datorii Calculator");

        int amount = 51000;
        int years = 30;
        double rate = 2.71;

        int a = 2;
        int b = 5;

        int added = a + b;
        int substracted = a - b;

        double c = 1.2;
        double d = 2.1;

        double multiplied = c * d;
        double divided = c/d;

        boolean inStore = true;
        boolean isPaid = false;

        boolean requireRefund = (isPaid == true) && (inStore == false);
    }
}
