package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your name: ");
        String s = scanner.nextLine();
        System.out.println("Your name is "+s+" and your age is "+age);
        scanner.close();
    }
}
