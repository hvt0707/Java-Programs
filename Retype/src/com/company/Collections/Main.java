package com.company.Collections;

import java.util.*;

class Main{
    public static void main(String []args) {
        int[] arr = {1,2,3,4,5};
        convertToWave(arr,5);
    }

    public static void convertToWave(int arr[], int n){
        int[] waveArray = arr;
        int i = 0;

        for(int run=0; run<n/2; run++){
            arr[i] = waveArray[i+1];
            arr[i+1] = waveArray[i];
            i+=2;
        }
        if(n%2 != 0) {
            arr[n - 1] = waveArray[n - 1];
        }
        for(int j=0; j<n;j++){
            System.out.println(arr[j]);
        }
    }
}