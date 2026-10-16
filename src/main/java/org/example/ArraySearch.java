package org.example;

public class ArraySearch {
//    Create ArraySearch. Search an integer array for a target value.
//    Display its index if found, or Value not found otherwise.
//Challenge: Report every matching index if the target appears more than once.
    public void search(){
        int[] num = {4,7,66,98,45};
        int searchedNum = 6;

        for(int i=0;i < num.length;i++){
            if(searchedNum == num[i]){
                System.out.println(num[i]);
                return;
            }
        }
            System.out.println("The number does not exist!!");
    }
}
