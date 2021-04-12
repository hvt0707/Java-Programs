import java.util.ArrayList;

public class Phone{
    private ArrayList<Contacts> contacts = new ArrayList<>();

    public boolean addNewContact(Contacts contacts){
        if(findContact(contacts.getName())>=0) {
            System.out.println("Name already exists. Please try with a different name.");
            return false;
        }
        else{
            this.contacts.add(contacts);
            System.out.println("Contact added successfully.");
            return true;
        }
    }

    public void editContact(Contacts oldContact,Contacts newContact){
        int check = findContact(oldContact);
        if(check>=0){
            contacts.set(check,newContact);
            System.out.println("Contact has been edited");
        }
        else
            System.out.println("Contact can't be updated.");
    }

    private int findContact(Contacts contact){
        return contacts.indexOf(contact);
    }

    private int findContact(String name){
        for(int i=0;i<contacts.size();i++){
            if(contacts.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }

    public Contacts findQuery(Contacts contact){
        if(findContact(contact)>=0){
            System.out.println("contact found.");
            return contact;
        }
        return null;
    }

    public Contacts findQuery(String name){
        int index = findContact(name);
        if(index>=0){
            System.out.println("contact found");
            return contacts.get(index);
        }
        return null;
    }

    public void removeContact(String name){
        int index = findContact(name);
        if(index>=0){
            contacts.remove(index);
            System.out.println("Contact successfully removed");
        }
        else
            System.out.println("Contact not found");
    }

    public void printContacts(){
        for(int i=0;i<contacts.size();i++){
            System.out.println(i+". "+contacts.get(i).getName()+"-->"+contacts.get(i).getPhoneNumber()+"\n");
        }
    }
}

