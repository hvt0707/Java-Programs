public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("north");
        Wall wall4 = new Wall("south");
        Ceiling ceiling = new Ceiling(5,"star wars");
        Bed bed = new Bed(2,2,2);
        Lamp lamp = new Lamp(true,"classic");

        Bedroom bedroom = new Bedroom(wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bed.make();
        bedroom.makeBed();
        lamp.turnON();
    }
}
