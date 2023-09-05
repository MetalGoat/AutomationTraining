package com.codingExercise3.Inheritance;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(50000.0);
        HRManager hrManager = new HRManager(60000.0);

        System.out.println("Employee Salary: $" + employee.getSalary());
        employee.work();

        System.out.println("HR Manager Salary: $" + hrManager.getSalary());
        hrManager.work();
        hrManager.addEmployee(employee);
    }
}
