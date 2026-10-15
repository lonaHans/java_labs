package org.example;

public class Employee {
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
