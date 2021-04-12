package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    double a = 20.00d;
	    double b = 80.00d;
	    double c = (a+b)*100.00;
	    int rem = (int)(c%40.00);
	    boolean x = (rem==0)?true:false;
		System.out.println(x);
		if(x==false)
			System.out.println("got some reminder");
		else
			System.out.println("got no reminder");
    }
}
