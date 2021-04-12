public class Bed {
    private int height,pillow,sheet;

    public Bed(int height, int pillow, int sheet) {
        this.height = height;
        this.pillow = pillow;
        this.sheet = sheet;
    }

    public void make()
    {
        System.out.print("completed");
    }

    public int getHeight() {
        return height;
    }

    public int getPillow() {
        return pillow;
    }

    public int getSheet() {
        return sheet;
    }
}
