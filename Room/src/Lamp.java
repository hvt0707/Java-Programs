public class Lamp {
    private boolean battries;
    private String style;

    public Lamp(boolean battries, String style) {
        this.battries = battries;
        this.style = style;
    }

    public boolean isBattries() {
        return battries;
    }

    public String getStyle() {
        return style;
    }

    public void turnON()
    {
        System.out.println("turn on");
    }
}
