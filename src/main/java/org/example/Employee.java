package org.example;

public class Employee {
//    Create an Employee class with employee number, name, and monthly salary.
//    Create an array of at least five employee objects.
//    Display each employee's details, employees earning more than a threshold, the highest salary, and the average salary.
//Use if statements to classify salaries as below 10,000, from 10,000 up to but not including 20,000, or 20,000 and above.
    String empNo;
    String name;
    double salary;

    public Employee(String empNo, String name, double salary) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Number: " + this.empNo);
        System.out.println("Name: " + this.name);
        System.out.println("Monthly Salary: R" + this.salary);

    }
}
