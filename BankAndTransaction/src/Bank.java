import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public void addBranch(String name){
        Branch newBranch = new Branch(name);
        branches.add(newBranch);
        System.out.println("Branch with name '"+name+"' has been added");
    }

    public void addCustomer(String branchName,String customerName,double initialAmount){
        Branch branch = searchBranch(branchName);
        branch.addCustomer(customerName,initialAmount);
    }

    public void deposit(String branchName,String name,double amount){
        searchBranch(branchName).searchCustomer(name).deposit(amount);
    }

    public void withdraw(String branchName,String name,double amount){
        searchBranch(branchName).searchCustomer(name).withdraw(amount);
    }

    public Branch searchBranchUsingCustomerName(String customerName){
        for(int i=0;i<branches.size();i++) {
            Branch searchBranch = branches.get(i);
            if (searchBranch.searchCustomer(customerName) != null)
                return searchBranch;
        }
        return null;
    }

    public Branch searchBranch(String name){
        for(int i=0;i<branches.size();i++){
            if(branches.get(i).getName().equals(name))
                return branches.get(i);
        }
        System.out.println("Branch with the name '"+name+"' not found.");
        return null;
    }

    public void customerList(String branchName){
        searchBranch(branchName).customerList();
    }
}
