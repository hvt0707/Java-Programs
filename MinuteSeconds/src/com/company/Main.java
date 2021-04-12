package com.company;

import com.sun.jdi.Value;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(70,50));
        System.out.println(getDurationString(10));
    }

    public static String getDurationString(int minutes,int seconds){
        if(minutes>=0 &&(seconds >= 0 && seconds <=59 )){
            int hours;
            hours = minutes/60;
            minutes = minutes%60;
            String Hstring,Mstring,Sstring;
            Hstring = hours+"h ";
            Mstring = minutes+"m ";
            Sstring = seconds+"s";
            if(hours<10)
                Hstring = "0"+hours+"h ";
            if(minutes<10)
                Mstring = "0"+minutes+"m ";
            if(seconds<10)
                Sstring = "0"+seconds+"s";
            return Hstring+Mstring+Sstring;
        }
        else
            return "Invalid Value";
    }
    public static String getDurationString(int seconds){
        if(seconds<0)
            return "Invalid Value";
        int minutes = seconds/60;
        seconds = seconds%60;
        return getDurationString(minutes,seconds);
    }
}
