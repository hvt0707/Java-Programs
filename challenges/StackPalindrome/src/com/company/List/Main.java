package com.company.List;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        System.out.println(checkPalindrome(s));
    }

    public static boolean checkPalindrome(String s){
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder string = new StringBuilder(s.length());
        String lowerCase = s.toLowerCase();
        for(int i=0;i < lowerCase.length(); i++){
            char ch = lowerCase.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                string.append(ch);
                stack.push(ch);
            }
        }

        StringBuilder reverse = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }

        return string.toString().equals(reverse.toString());
    }
}
