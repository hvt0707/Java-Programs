package com.company;

public class Main {

    public static void main(String[] args) {
	    float FloatMax = Float.MAX_VALUE;
	    float FloatMin = Float.MIN_VALUE;
        System.out.println("Max of float = "+FloatMax);
        System.out.println("Min of float = "+FloatMin);

        double DoubleMax = Double.MAX_VALUE;
        double DoubleMin = Double.MIN_VALUE;
        System.out.println("Max of double = "+DoubleMax);
        System.out.println("Min of double = "+DoubleMin);

        // challenge to convert pounds to kilograms

        float pound = 12.5f;
        double kilograms = pound*0.45359237;
        System.out.println(pound +"-->"+ kilograms);
    }
}
