package com.codingExercise3.Encapsulation;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    // Constructor to initialize the Employee object
    public Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    // Getter method for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter method for employeeId
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter method for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter method for employeeName
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter method for employeeSalary, returning a formatted string
    public String getEmployeeSalary() {
        return String.format("%.2f", employeeSalary);
    }

    // Setter method for employeeSalary
    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public static void main(String[] args) {

        Employee emp = new Employee(1993, "Tudor Popescu", 50000);
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Salary: $" + emp.getEmployeeSalary());

        // Update salary
        emp.setEmployeeSalary(55000.75);
        System.out.println("Updated Employee Salary: $" + emp.getEmployeeSalary());
    }
}
