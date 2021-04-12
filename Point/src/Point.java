public class Point {
    private int x,y;
    public Point()
    { }

    public Point(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance()
    {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(int x,int y)
    {
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }

    public double distance(Point p)
    {
        return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
    }
}
