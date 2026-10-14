package org.example;

public class Student_ {
    String studentNumber, name;
    int [] marks;

    public Student_(String name, int[] marks, String studentNumber) {
        this.name = name;
        this.marks = marks;
        if(marks.length != 3){
            System.out.println("There must be 3 marks in total");
        }
        this.studentNumber = studentNumber;
    }

    public void average(){
        double average = this.marks /3;
    }


}
