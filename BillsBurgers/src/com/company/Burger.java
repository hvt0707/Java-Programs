package com.company;

import javax.crypto.spec.PSource;

public class Burger {
    private String name,breadType,meat;
    private double basePrice;

    private String addition1,addition2,addition3,addition4;
    private double addition1price,addition2price,addition3price,addition4price;

    public Burger(String name, String breadType, String meat, double basePrice) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void addAddition1(String name,double price){
        addition1 = name;
        addition1price = price;
    }
    public void addAddition2(String name,double price){
        addition2 = name;
        addition2price = price;
    }
    public void addAddition3(String name,double price){
        addition3 = name;
        addition3price = price;
    }
    public void addAddition4(String name,double price){
        addition4 = name;
        addition4price = price;
    }


    public double itemizeBurger(){
        double basePrice = this.basePrice;
        System.out.println("Base price of the burger is "+basePrice);
        if(addition1!=null){
            basePrice+=addition1price;
            System.out.println(addition1+" of "+addition1price+"$ is added to your burger ");
        }
        if(addition2!=null){
            basePrice+=addition2price;
            System.out.println(addition2+" of "+addition2price+"$ is added to your burger ");
        }
        if(addition3!=null){
            basePrice+=addition3price;
            System.out.println(addition3+" of "+addition3price+"$ is added to your burger ");
        }
        if(addition4!=null){
            basePrice+=addition4price;
            System.out.println(addition4+" of "+addition4price+"$ is added to your burger ");
        }
        return basePrice;
    }

}
