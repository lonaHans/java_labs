package org.example;

public class NumberAnalysis {
//    Create NumberAnalysis.
//    Determine whether an integer is positive, negative, or zero, and whether it is even or odd.
//    Remember that zero is even.
    public void analysis(){
        int number =0;
        int isEven;

        if(number >0){
            System.out.println("The number is a positive integer");
        }
        else if(number <0){
            System.out.println("The number is a negative integer");
        }
        else{
            System.out.println("The number is a zero");
        }

        isEven = number % 2;

        if(isEven == 0){
            System.out.println("The number is an even number");
        }
        else{
            System.out.println("The number is an odd number");
        }
    }
}
