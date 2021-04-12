import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player harsh = new Player("Huracan");
        saveValues(harsh);
        System.out.println(harsh);
        loadValues(harsh);
        System.out.println(harsh);
    }

    private static ArrayList<String> readValues(){
        int index = 0;
        ArrayList<String> values = new ArrayList<>();
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Press\n" +
                    "0. to quit.\n" +
                    "1. to enter a String.");
            short option = scanner.nextShort();
            switch(option){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    scanner.nextLine();
                    String input = scanner.nextLine();
                    values.add(index,input);
                    index++;
            }
        }while(!quit);
        return values;
    }

    private static void saveValues(ISavable valuesToSave){
        for(int i=0;i<valuesToSave.write().size();i++){
            System.out.println("Saving "+valuesToSave.write().get(i)+" in the storage.");
        }
    }

    private static void loadValues(ISavable valuesToLoad){
        ArrayList<String> values = readValues();
        valuesToLoad.read(values);
    }
}
