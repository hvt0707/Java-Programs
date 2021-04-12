public class Vehicle {
    private String name,size;
    private int currentVelocity,currentDirection;

    public Vehicle(String name,String size)
    {
        this.name=name;
        this.size=size;
        this.currentDirection=0;
        this.currentVelocity=0;
    }

    public void steer(int direction)
    {
        this.currentDirection+=direction;
        System.out.println("direction: "+currentDirection);
    }

    public void move(int velocity,int direction)
    {
        this.currentDirection=direction;
        this.currentVelocity=velocity;
        System.out.println("velocity : "+currentVelocity);
        System.out.println("direction : "+currentDirection);
    }

    public void stop()
    {
        currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
