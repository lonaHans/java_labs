package org.example;

public class ArrayStatistics {
//    Create ArrayStatistics.
//    Use an array of at least six integers to find the largest value, smallest value, and number of elements.
//    Challenge: Count how many values are greater than or equal to 50.
    public void stats(){
        int [] num = {2,5,6,12,1,77};
        int max =num[0];
        int min = num[0];
        int count =0;

        for(int i=0; i< num.length; i++){
            if(num[i] > max){
                max = num[i];
            }

            if(num[i] < min){
                min = num[i];
            }

            if(num[i] >= 50){
                count++;
            }
        }

        System.out.println("The largest value is: " + max);
        System.out.println("The smallest value is: " + min);
        System.out.println("The values greater than 50 are: " + count);


    }

}
