package com.company.Search;

public class Main {

    public static void main(String[] args) {
        int intArray[] = {-23,-5,1,10,12,45,56};
        System.out.println(iterativeBinarySearch(intArray,1));
        System.out.println(iterativeBinarySearch(intArray,77));
        System.out.println(iterativeBinarySearch(intArray,10));
        System.out.println(iterativeBinarySearch(intArray,45));
    }

    public static int iterativeBinarySearch(int[] array, int value){
        int start = 0;
        int end = array.length;

        while(start < end){
            int midpoint = (start+end)/2;
            if(array[midpoint] == value){
                return midpoint;
            }
            else if(array[midpoint] < value){
                start = midpoint+1;
            }
            else{
                end = midpoint;
            }
        }
        return -1;
    }
}
