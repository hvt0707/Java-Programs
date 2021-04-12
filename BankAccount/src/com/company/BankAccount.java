package com.company;

public class BankAccount {
    private double balance;
    private String customerName,email,accountNumber,phoneNumber;

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAccountNumber()
    {
        return this.accountNumber;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public String getCustomerName()
    {
        return this.customerName;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void depositFunds(double deposit)
    {
        this.balance+=deposit;
        System.out.println("Current Balance : "+this.balance);
    }
    public void withdrawFunds(double withdraw)
    {
        if(this.balance<withdraw)
        {
            System.out.println("Insufficient Balance");
            System.out.println("Current Balance : "+this.balance);
        }
        else
        {
            this.balance -= withdraw;
            System.out.println("Current Balance : "+this.balance);
        }
    }
}
