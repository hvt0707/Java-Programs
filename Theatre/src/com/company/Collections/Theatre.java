package com.company.Collections;

import java.util.*;

public class Theatre {
    private final String name;
    private List<Seat> seats = this.seats = new ArrayList<>();
    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if(seat1.getPrice() > seat2.getPrice()){
                return 1;
            }
            else if(seat1.getPrice() < seat2.getPrice()){
                return -1;
            }
            else{
                return 0;
            }
        }
    };

    public Theatre(String name, int rows, int seatsPerRow){
        this.name = name;

        int lastRow = 'A'+(rows-1);
        for(char row = 'A'; row <= lastRow; row++){
            for(int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++){
                double price = 12.00;
                if((row > 'D') && (seatNumber >= 4 && seatNumber <= 9)){
                    price = 14.00;
                }
                else if((row > 'F') || (seatNumber < 4) || (seatNumber > 9)){
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNumber), price);
                seats.add(seat);
            }
        }
    }

    public String getName(){
        return this.name;
    }

    public boolean reserveSeat(String seatNumber){
        Seat reservedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, reservedSeat, null);
        if(foundSeat >= 0){
            return seats.get(foundSeat).reserve();
        }
        else{
            System.out.println("Seat not found.");
            return false;
        }
    }

    public Collection<Seat> getSeats(){
        return seats;
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price){
            this.seatNumber = seatNumber;
            this.price = price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve(){
            if(!this.reserved){
                System.out.println(seatNumber+" seat reserved.");
                this.reserved = true;
                return true;
            }
            else {
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println(seatNumber+" reservation canceled.");
                return true;
            }
            else{
                return false;
            }
        }

        public String getSeatNumber(){
            return this.seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }
}
