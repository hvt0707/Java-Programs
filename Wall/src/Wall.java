public class Wall {
    private double width,height;

    public Wall()
    {

    }
    public Wall(double width,double height)
    {
        this.height = height;
        this.width = width;
        if(width<0)
            this.width = 0;
        if(height<0)
            this.height = 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        if(width<0)
            this.width = 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        if(height<0)
            this.height = 0;
    }

    public double getArea()
    {
        return width * height;
    }
}
