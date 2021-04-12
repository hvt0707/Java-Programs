package com.company;

public class DeluxeBurger extends Burger {
    public DeluxeBurger(){
        super("Deluxe Burger","white","sausage & bacon",5.6);
        super.addAddition1("chips",1.3);
        super.addAddition2("drinks",2.7);
    }


    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Can not add additional items to Deluxe Burgers.");;
    }
    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Can not add additional items to Deluxe Burgers.");;
    }
    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Can not add additional items to Deluxe Burgers.");;
    }
    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Can not add additional items to Deluxe Burgers.");;
    }
}
