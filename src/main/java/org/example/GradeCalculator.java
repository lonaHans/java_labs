package org.example;

public class GradeCalculator {
    public void calculator(){
        int mark = 110;

        if(mark >= 80 && mark <= 100){
            System.out.println("You have obtained a distinction");
        }
        else if(mark >= 70 && mark <= 79){
            System.out.println("You have obtained a merit");
        }
        else if(mark >=50 && mark <=69){
            System.out.println("You have obtained a pass");
        }
        else if(mark <= 49){
            System.out.println("You have obtained a fail");
        }
        else{
            System.out.println("Invalid mark");
        }
    }
}
