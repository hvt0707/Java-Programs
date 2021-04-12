package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = {4725, 4586, 1330, 8792, 1592, 5729};
	    radixSort(intArray, 10, 4);
	    for(int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i]+"  ");
    }

    public static void radixSort(int[] input, int radix, int width){
        for(int i = 0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix){
        int numItems = input.length;
        int[] countArray = new int[radix];

        for(int value: input){
            countArray[getDigit(value, position, radix)]++;
        }

        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j-1];
        }

        int[] temp = new int[numItems];
        for(int tempIndex = numItems-1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(input[tempIndex], position, radix)]] = input[tempIndex];
        }

        System.arraycopy(temp, 0, input, 0, numItems);
    }

    public static int getDigit(int value, int position, int radix){
        return value/(int)Math.pow(radix, position)%radix;
    }
}
