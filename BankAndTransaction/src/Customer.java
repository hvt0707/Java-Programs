import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transaction;
    private double totalBalance = 0;
    private String name;
    public Customer(String name,double initialBalance){
         this.name = name;
        double InitialBalance = initialBalance;
        transaction = new ArrayList<Double>();
    }

    public void deposit(double money){
        transaction.add(money);
        totalBalance += money;
        System.out.println(money+" has been added to your account.");
        System.out.println("Account Balance: "+totalBalance);
    }

    public void withdraw(double money){
        transaction.add(-money);
        totalBalance -= money;
        System.out.println(money+"has been withdrawn from your account.");
        System.out.println("Account Balance: "+totalBalance);
    }

    public String getName(){
        return this.name;
    }
}
