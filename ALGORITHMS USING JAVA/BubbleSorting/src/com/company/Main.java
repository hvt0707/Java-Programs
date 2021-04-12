package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = {20,35,-15,7,55,1,-22};
        for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex > 0;lastUnsortedIndex--){
	        for(int i=0;i<lastUnsortedIndex;i++){
	            if(intArray[i]>intArray[i+1])
	                swap(intArray,i,i+1);
            }
        }

        for(int i=0;i<intArray.length;i++){
            System.out.print(intArray[i]+"  ");
        }
    }
    public static void swap(int[] intArray, int i, int j){
        if(i==j)
            return;
        int temp = intArray[i];
        intArray[i] = intArray[i+1];
        intArray[i+1] = temp;
    }
}
