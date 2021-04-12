package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=1,sum=0;
        while(count<=10)
        {
            System.out.println("Enter Number #"+count+": ");
            boolean checkInt = scanner.hasNextInt();
            if(checkInt)
            {
                int number = scanner.nextInt();
                sum+=number;
                count++;
            }
            else
            {
                System.out.println("Invalid Value");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of all the 10 numbers is "+sum);
        scanner.close();
    }
}
