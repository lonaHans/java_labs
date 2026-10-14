package org.example;

public class Student_ {
    String studentNumber;
    String name;
    int [] marks;

    public Student_(String name, int[] marks, String studentNumber) {

        if(marks == null || marks.length != 3 ){
            System.out.println("There must be 3 marks in total");
        }

        for(int i = 0; i < marks.length; i++){
            if(marks[i] < 0 || marks[i] > 100){
                System.out.println("Marks must be between 0 and 100 only!!" );
            }
        }
        this.studentNumber = studentNumber;
        this.name = name;
        this.marks = marks;
    }

    public double average(){

        int average =0 ;
        for(int i =0; i < this.marks.length; i++){
            average += this.marks[i];
        }
        return average /3.0;
    }

    public boolean hasPassed(){
        if(average() >= 50){
            return true;
        }
        return false;
    }

    public void displaySummary(){
        System.out.println("Name: " + this.name );
        System.out.println("Student number: " + this.studentNumber );
        //System.out.println("Marks: " + this.marks );
        System.out.println("Student average: " + average());
        if (hasPassed()) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

    }


}
