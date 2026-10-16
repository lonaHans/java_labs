package org.example;

public class GradeCalculator {
//Create GradeCalculator and classify marks:
//Mark Grade
//80--100 Distinction 70--79 Merit 50--69 Pass 0--49 Fail Outside 0--100 Invalid mark
//Order conditions correctly so each mark receives one result.
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
