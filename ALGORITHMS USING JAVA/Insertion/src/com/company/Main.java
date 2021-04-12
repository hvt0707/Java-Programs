package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = {12,-13,55,32,-5,6,43};

	    for(int firstUnsortedIndex = 1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++){
	        int newElement = intArray[firstUnsortedIndex];
	        int i;
	        for(i = firstUnsortedIndex;i>0 && intArray[i-1]>newElement;i--){
	            intArray[i] = intArray[i-1];
            }
	        intArray[i] = newElement;
        }

	    for(int i=0; i<intArray.length;i++)
            System.out.print(intArray[i]+"  ");
    }
}
