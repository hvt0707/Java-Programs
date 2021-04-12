package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int max=0,min=0;
        boolean first = true;
        while(true)
        {
            System.out.println("Enter Number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt)
            {
                int number = scanner.nextInt();
                if(first)
                {
                    first=false;
                    max = number;
                    min = number;
                }
                if(number>max)
                    max = number;
                if(number<min)
                    min = number;
            }
            else
                break;
        }
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
        scanner.close();
    }
}