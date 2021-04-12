package com.company;

public class Main {

    public static void main(String[] args) {
    BankAccount harshAccount = new BankAccount();
    harshAccount.withdrawFunds(100);
    harshAccount.depositFunds(100);
    harshAccount.depositFunds(100);
    VipCustomer harsh = new VipCustomer();

    System.out.println(harsh.getCreditLimit());
        System.out.println(harsh.getEmail());
        System.out.println(harsh.getName());
    }
}
