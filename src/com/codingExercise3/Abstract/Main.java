package com.codingExercise3.Abstract;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Tudor Popescu", 1, 50000.0, 10000.0);
        Programmer programmer = new Programmer("Tudor II Popescu", 2, 25.0, 160);

        manager.displayInfo();
        System.out.println();
        programmer.displayInfo();
    }
}
