package com.company.HashTable;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {12,43,45,56,78,55,67};
        bucketSort(intArray);
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i]+"  ");
        }
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];
        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new LinkedList<>();
        }

        for(int i = 0; i < input.length; i++){
            buckets[hash(input[i])].add(input[i]);
        }

        for(List bucket: buckets){
            Collections.sort(bucket);
        }

        int j = 0;
        for(int i = 0; i < buckets.length; i++){
            for(Integer value: buckets[i]){
                input[j++] = value;
            }
        }
    }

    public static int hash(int num){
        return num / 10;
    }
}
