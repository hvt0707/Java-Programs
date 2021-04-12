public class Contacts {
    private String name,phoneNumber;
    public Contacts(String name,String phoneNumber){
        this.name = name;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts createNewContact (String name,String number){
        return new Contacts(name,number);
    }
}
