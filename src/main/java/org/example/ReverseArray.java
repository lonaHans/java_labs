package org.example;

public class ReverseArray {
    public void reverseNumbers(){
        int [] numbers = {2,32,22, 1234, 76, 65};

        for(int i = numbers.length-1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}
