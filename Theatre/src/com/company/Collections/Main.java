package com.company.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Alka Talkies", 8, 12);
//        if(theatre.reserveSeat("B12")){
//            System.out.println("Please pay for B12");
//        }
//        else{
//            System.out.println("Seat already reserved.");
//        }
//
//        if(theatre.reserveSeat("D13")){
//            System.out.println("Please pay for D13");
//        }
//        else{
//            System.out.println("Seat already reserved.");
//        }
        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);
        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> seats){
        for(Theatre.Seat seat: seats){
            System.out.print(seat.getSeatNumber()+": "+seat.getPrice()+"$ | ");
        }
        System.out.println();
        System.out.println("===============================================");
    }
}
