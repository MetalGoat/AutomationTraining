package com.codingExercise3.Polymorphism;

// Employee class
class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public double calculateSalary() {
        // Default salary
        return 0.0;
    }

    public void displayInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + calculateSalary());
    }
}

// Manager subclass
class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Programmer subclass
class Programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Programmer(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

