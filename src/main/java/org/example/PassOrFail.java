package org.example;

public class PassOrFail {
    public void getMark(){
        int mark = 100;

        if(mark < 0 || mark >100){
            System.out.println("Mark must be below 100 and above 0!!");
        }
        else if(mark >= 50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }


    }
}
