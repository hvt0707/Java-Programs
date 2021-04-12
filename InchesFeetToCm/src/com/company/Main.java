package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(7,5));
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
        if (feet>=0 && (inches>=0 && inches<=12))
             return feet*30.48 + inches*2.54;
        else
            return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            double feet = (int)inches/12;
            double inch = (int)inches%12;
            return calcFeetAndInchesToCentimeters(feet,inch);
        }
        else
            return -1;
   }

}
