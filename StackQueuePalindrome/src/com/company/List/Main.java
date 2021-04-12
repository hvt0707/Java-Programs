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

    public static boolean checkPalindrome(String string){
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String lowerCase = string.toLowerCase();
        StringBuilder onlyAplha = new StringBuilder(lowerCase.length());
        for(int i=0; i<string.length();i++){
            if(lowerCase.charAt(i)>='a' && lowerCase.charAt(i)<='z'){
                char ch = lowerCase.charAt(i);
                stack.push(ch);
                queue.add(ch);
                onlyAplha.append(ch);
            }
        }
        for(int i=0; i<onlyAplha.length(); i++){
            if(stack.pop() != queue.remove()){
                return false;
            }
        }
        return true;
    }
}
