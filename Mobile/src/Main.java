import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Phone phone = new Phone();

    public static void main(String[] args) {
        boolean quit = true;
        startPhone();
        menu();
        while(quit){
            System.out.println("Enter action: (6. to show menu o f available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("turning off...");
                    quit = false;
                    break;
                case 1:
                    newContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    printContacts();
                    break;
                case 6:
                    menu();
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }

    private static void newContact(){
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        if(phone.findQuery(name)!=null)
            System.out.println("Name already exists.");
        else{
            System.out.println("Enter number:");
            String number = scanner.nextLine();
            Contacts newContact = Contacts.createNewContact(name,number);
            phone.addNewContact(newContact);
        }
    }

    private static void editContact(){
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        Contacts isPresent = phone.findQuery(name);
        if(isPresent!=null){
            System.out.println("Enter a new name:");
            String newName = scanner.nextLine();
            System.out.println("Enter number:");
            String newNumber = scanner.nextLine();
            Contacts newContact = Contacts.createNewContact(newName,newNumber);
            phone.editContact(isPresent,newContact);
            System.out.println(isPresent.getName()+"has been replaced with "+newContact.getName());
        }
    }

    private static void searchContact(){
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        Contacts isPresent = phone.findQuery(name);
        if(isPresent!=null){
            System.out.println("Contact found");
            System.out.println(isPresent.getName()+"-->"+isPresent.getPhoneNumber());
        }
        else
            System.out.println("Contact not found");
    }

    private static void removeContact(){
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        phone.removeContact(name);
    }

    private static void printContacts(){
        phone.printContacts();
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void menu(){
        System.out.println("Menu");
        System.out.println("Press");
        System.out.println("0. to quit \n" +
                           "1. to create a new contact\n"+
                           "2. to edit a contact\n"+
                           "3. to search a contact\n"+
                           "4. to remove a contact\n"+
                           "5. to print all contacts\n"+
                           "6. to show menu");
    }
}
