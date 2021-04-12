class Student{
    String name;
    public Student(){
        this.name = "Kushal";
    }
}

public class Kus extends Student{
    String name;
    public Kus(){
        super();
    }
    void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Kus k = new Kus();
        k.printName();
    }
}