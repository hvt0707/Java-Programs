package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] myArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
	    radixSort(myArray, 26, 5);
	    for(int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]+", ");
    }

    public static void radixSort(String[] input, int radix, int width){
        for(int i = width - 1; i >= 0; i--){
            radixSingleSort(input, radix, i);
        }
    }

    public static void radixSingleSort(String[] input, int radix, int position){
        int numItems = input.length;
        String temp[] = new String[numItems];
        int countArray[] = new int[radix];

        for(String s: input){
            countArray[s.charAt(position)-97]++;
        }

        for(int i = 1; i < radix; i++){
            countArray[i] += countArray[i-1];
        }

        for(int tempIndex = numItems-1; tempIndex >= 0; tempIndex--){
            temp[--countArray[input[tempIndex].charAt(position)-97]] = input[tempIndex];
        }

        System.arraycopy(temp, 0, input, 0, numItems);
    }
}
