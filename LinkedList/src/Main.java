import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> city = new LinkedList<>();
        addInOrder(city,"Delhi");
        addInOrder(city,"Mumbai");
        addInOrder(city,"Indore");
        addInOrder(city,"Pune");
        addInOrder(city,"Bhopal");
        printCity(city);
        System.out.println("=================================");
        visit(city);
    }

    public static void printCity(LinkedList<String> city){
        Iterator<String> i = city.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
    }

    public static void addInOrder(LinkedList<String> city,String cityName){
        ListIterator<String> viewing = city.listIterator();
        while(viewing.hasNext()){
            int comparison = viewing.next().compareTo(cityName);
            if(comparison==0){
                //equal, already exist
                System.out.println(cityName+" already exist in the list.");
                return;
            }
            else if(comparison>0){
                viewing.previous();
                viewing.add(cityName);
                return;
            }
            else if(comparison<0) {
                //move to next city
            }
        }
        viewing.add(cityName);
        return;
    }

    public static void visit(LinkedList<String> city){
        ListIterator<String> listIterator = city.listIterator();
        boolean goingForward = true;
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        printMenu();
        while (!quit){
            System.out.println("Enter actions -");
            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    System.out.println("Journey Over:)");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext())
                            listIterator.next();
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("You have arrived at "+ listIterator.next());
                    }
                    else {
                        System.out.println("You are the end of the list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("You have arrived at "+ listIterator.previous());
                    }
                    else {
                        System.out.println("You are the start of the list.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("Actions available");
        System.out.println("Press -");
        System.out.println("0. Quit\n" +
                "1. Move Forward\n" +
                "2. Move Backward\n" +
                "3. Print Menu");
    }
}
