package com.company;

public class VipCustomer {
    private String name,email;
    private double creditLimit;
    public VipCustomer(String name, String email, double creditLimit)
    {
        this.creditLimit = creditLimit;
        this.email = email;
        this.name = name;
    }
    public VipCustomer()
    {
        this("Not Provided","Not Provided",10000);
    }
    public VipCustomer(String name,String email)
    {
        this(name,email,10000);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
