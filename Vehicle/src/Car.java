public class Car extends Vehicle{
    private int wheels,doors,gears,currentGear;
    private boolean isManual;

    public Car(String name, String size, int wheels, int doors,int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
        this.isManual = isManual;
    }

    public void changeGear(int gear)
    {
        currentGear=gear;
        System.out.println("Gear changed to "+currentGear);
    }

    public void changeVelocity(int velocity,int direction)
    {
        move(velocity,direction);
        System.out.println("Velocity: "+velocity+"  Direction: "+direction);
    }
}
