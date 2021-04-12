package com.company;

public class Series {
    public static int nSum(int n){
        int sum=0;
        for(int i=1; i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static int factorial(int n){
        int product = 1;
        for(int i=1; i<=n; i++){
            product*=i;
        }
        return product;
    }

    public static void fibonacci(int n){
        int sum;
        int t1 = 0;
        int t2 = 1;
        if(n<=0) {
            System.out.println("Invalid Input.");
        }
        else{
            for(int i = 1; i <= n; i++){
                System.out.print(t1+", ");
                sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
            System.out.println();
        }
    }
}
