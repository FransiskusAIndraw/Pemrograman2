package Soal1;
public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle( double w, double l) {
        super("Rectangle");
        this.width = w;
        this.length = l;
    }
    @Override
    protected double area() {
        return length * width;
    }
    @Override
    public String toString() {
        return "Rectangle {" + "width =" + width + ", length =" + length + '}';
    }
}
