package org.example;

import java.util.ArrayList;

public class EvenOddArray {
//    Create EvenOddArray. Count the even and odd values in an integer array.
//Challenge: Store the even and odd values in separate arrays or lists.
    public void evenOdd(){
        int [] numbers = {2,3,6,5,11,122,7};
        ArrayList<Integer> evenNum = new ArrayList<>();
        ArrayList<Integer> oddNum = new ArrayList<>();

        for(int i=0; i< numbers.length;i++){
            if(numbers[i] % 2 == 0){
                evenNum.add(numbers[i]);
            }
            else{
                oddNum.add(numbers[i]);
            }
        }

        System.out.println("The total number of even number is: " + evenNum.size());
        System.out.println("The total number of odd number is: " + oddNum.size());
    }
}
