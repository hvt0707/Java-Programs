public class Rectangle {
    private double width,length;

    public Rectangle(double width,double length){
        if(width<0)
            width=0;
        if(length<0)
            length=0;
        this.length=length;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return length*width;
    }
}
