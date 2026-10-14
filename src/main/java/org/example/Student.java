package org.example;

public class Student {
    String name;
    String studentNumber;
    double mark;

    public  Student(String name,String studentNumber,double mark){
        this.name = name;
        this.studentNumber =studentNumber;
        this.mark = mark;

    }
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Student number: " + studentNumber);
        System.out.println("Mark: " + mark);

        System.out.println("Result: " + hasPassed());
    }

    public boolean hasPassed(){
         if (mark >= 50){
             return true;
         }
         else{
             return false;
         }
    }

}
