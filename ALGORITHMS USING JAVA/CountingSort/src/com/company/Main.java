package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = {4,2,4,5,3,6,2,8,7,9,5,4,3,2,5};
	    countingSort(intArray,1,10);

	    for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i]+"  ");
    }

    public static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[max-min+1];

        for(int i=0;i<input.length;i++){
            countArray[input[i]-min]++;
        }

        int j=0;

        for(int i=min;i<=max;i++){
            while(countArray[i-min]>0){
                input[j++] = i;
                countArray[i-min]--;
            }
        }
    }
}
