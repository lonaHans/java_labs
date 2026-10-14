package org.example;

public class ArraySearch {
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
