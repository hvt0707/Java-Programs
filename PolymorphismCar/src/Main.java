class Car{
    private String name;
    private int cylinders,wheels=4 ;
    private boolean engine = true;

    public Car(String name, int cylinders, int wheels, boolean engine) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.engine = engine;
    }

    public void startEngine(){
        System.out.println("No sound.");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}

class Lamborghini extends Car {
    public Lamborghini() {
        super("Lamborghini Veneno", 12, 4, true);
    }

    public void startEngine() {
        System.out.println("VrooooomVrooooom");
    }
}

class Morgan extends Car{
    public Morgan() {
        super("Morgan 3-wheeler", 8, 3, true);
    }

    public void startEngine(){
        System.out.println("booooomtaktaktaktakkatktak");
    }
}

class Porsche extends Car{
    public Porsche(){
        super("Porsche Macan",8,4,true);
    }
}

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Car car = carSelector();
            System.out.println("Name: "+car.getName());
            System.out.println("Cylinders: "+car.getCylinders());
            System.out.println("Wheels: "+car.getWheels());
            car.startEngine();
        }
    }

    public static Car carSelector(){
        int car = (int)(Math.random()*3 + 1);
        switch(car){
            case 1:
                return new Lamborghini();
            case 2:
                return new Morgan();
            case 3:
                return new Porsche();
            default :
                return null;
        }
    }
}
