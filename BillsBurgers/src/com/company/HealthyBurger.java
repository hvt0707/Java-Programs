package com.company;

public class HealthyBurger extends Burger {
    private String addition5,addition6;
    private double addition5price,addition6price;

    public HealthyBurger(String meat,double price){
        super("Healthy Burger","Brown Bread",meat,price);
    }
    public void addAddition5(String name,double price){
        addition5 = name;
        addition5price = price;
    }
    public void addition6(String name,double price){
        addition6 = name;
        addition6price = price;
    }

    @Override
    public double itemizeBurger() {
        double healthyBurgerPrice = super.itemizeBurger();
        if(addition5!=null){
            healthyBurgerPrice+=addition5price;
            System.out.println(addition5 + " of " + +addition5price+"$ is added to your burger");
        }
        if(addition6!=null){
            healthyBurgerPrice+=addition6price;
            System.out.println(addition6 + " of " + +addition6price+"$ is added to your burger");
        }
        return healthyBurgerPrice;
    }
}
