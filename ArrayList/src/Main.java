public class Main {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        groceryList.addGroceryItem("Avocado");
        groceryList.addGroceryItem("Lettuce");
        groceryList.addGroceryItem("Eggplant");
        groceryList.printGroceryItem();
        groceryList.modifyGroceryItem(3,"Potato");
        groceryList.printGroceryItem();
        groceryList.removeGroceryItem(3);
        groceryList.printGroceryItem();
    }
}
