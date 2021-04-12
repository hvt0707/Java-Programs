package com.company;


public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger("classic","white","beef",3);
        burger.addAddition1("carrot",1.5);
        burger.addAddition2("onion",0.6);
        System.out.println("Total price of the burger is "+burger.itemizeBurger()+"$");

        DeluxeBurger dx = new DeluxeBurger();
        dx.itemizeBurger();
        dx.addAddition1("lettuce",3);
    }
}
