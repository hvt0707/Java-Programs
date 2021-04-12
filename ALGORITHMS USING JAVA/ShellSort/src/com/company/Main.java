package com.company;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {12,-13,55,32,-5,6,43};

        for(int gap = intArray.length/2;gap>0;gap/=2){
            for(int i=gap;i<intArray.length;i++){
                int newElement = intArray[i];
                int j = i;
                while(j>=gap && intArray[j-gap]>newElement){
                    intArray[j] = intArray[j-gap];
                    j-=gap;
                }
                intArray[j] = newElement;
            }
        }

        for(int i=0; i<intArray.length;i++)
            System.out.print(intArray[i]+"  ");
    }
}
