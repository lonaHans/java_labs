package org.example;

import java.util.ArrayList;

public class EvenOddArray {
    public void evenOdd(){
        int [] numbers = {2,3,6,5,11,122};
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
