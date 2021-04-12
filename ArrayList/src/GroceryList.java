import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryItem(){
        System.out.println("You have "+groceryList.size()+" items in your list-");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int number,String newItem){
        String oldItem = groceryList.get(number-1);
        groceryList.set(number-1,newItem);
        System.out.println(oldItem+" has been replaced with "+newItem);
    }

    public void removeGroceryItem(int number){
        System.out.println(groceryList.get(number-1)+" has been removed.");
        groceryList.remove(number-1);
    }
}
