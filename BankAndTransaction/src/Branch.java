import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public void addCustomer(String name, double initialBalance){
        if(searchCustomer(name)==null) {
            Customer newCustomer = new Customer(name, initialBalance);
            customers.add(newCustomer);
            System.out.println("Account with the name '"+name+"' has been added successfully to "+this.name+"branch with "
                    +initialBalance+" initial amount.");
        }
        else
            System.out.println("Customer with the name '"+name+"' already exist.\n" +
                                "Please try different name.");
    }

    public void deposit(String name,double amount){
        Customer customer = searchCustomer(name);
        customer.deposit(amount);
    }

    public void withdraw(String name,double amount){
        Customer customer = searchCustomer(name);
        customer.withdraw(amount);
    }

    public Customer searchCustomer(String name){
        Customer customer;
        for(int i=0;i<customers.size();i++){
            if(customers.get(i).getName().equals(name))
                return customers.get(i);
        }
        System.out.println("Customer with name "+name+" not found.");
        return null;
    }

    public int branchSize(){
        return customers.size();
    }

    public void customerList(){
        for(int i=0;i<customers.size();i++){
            System.out.println(customers.get(i));
        }
    }
}
