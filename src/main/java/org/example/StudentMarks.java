package org.example;

public class StudentMarks {
    public void marks(){
        int[] studentMarks = {20,29,10,50,12};
        int total =0;
        double avg = 0;

        for(int i=0; i< studentMarks.length; i++){
            System.out.println(studentMarks[i]);

            total += studentMarks[i];
            avg = total / 5;

        }
        System.out.println("The total is: " + total);
        System.out.println("The average is: " + avg);


    }
}
