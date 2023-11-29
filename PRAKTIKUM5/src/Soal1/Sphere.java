package Soal1;
class Sphere extends Shape{
    private double radius;
    public Sphere(double r) {
        super("Sphere");
        this.radius = r;
    }
    @Override
    protected double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere {" + "radius =" + radius + '}';
    }
}
