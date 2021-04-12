package com.company;

public class Main {

    public static void main(String[] args) {
	    int i,count=0;
	    for(i=1;i<=100;i++)
        {
            if(isPrime(i))
                count++;
        }
        System.out.println("From 1 to 100 there are "+count+" prime numbers.");
    }
    public static boolean isPrime(int x)
    {
        int i;
        if(x==1)
            return false;
        for(i=2;i<=(long)Math.sqrt(x);i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }
}
