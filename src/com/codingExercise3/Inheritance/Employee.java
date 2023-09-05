package com.codingExercise3.Inheritance;

// Employee class
class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return salary;
    }
}

// HRManager subclass
class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing employees.");
    }

    public void addEmployee(Employee employee) {
        System.out.println("HR Manager is adding a new employee.");
    }
}

