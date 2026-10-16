package org.example;

public class StudentDetails {

//    Create StudentDetails. Declare variables for a student's name (String), age (int), average mark (double), and registration status (boolean). Assign values and print a labelled summary.
//    Expected output example:
//    Student Name: Naledi
//    Age: 20
//    Average Mark: 76.5
//    Registered: true
    public void getStudentDetails(){
        String name = "Naledi";
        int age = 20;
        double avgMark = 76.5;
        boolean status = true;

        System.out.println("Student name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average Mark: " + avgMark);
        System.out.println("Registered: " + status);
    }
}
