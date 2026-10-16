package org.example;

public class ReverseArray {
//    Create ReverseArray. Display the array in reverse order without changing the original array.
//Challenge: Reverse the array in place by swapping elements.
    public void reverseNumbers(){
        int [] numbers = {2,32,22, 1234, 76, 65};

        for(int i = numbers.length-1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}
