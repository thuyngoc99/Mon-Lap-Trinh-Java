package Bai8;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        while (radius != 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;

    }

    public double getArea(){
        return (3.14 * radius * radius );
    }

    @Override
    public String toString() {
        return "radius: " + radius + " - Dien tich hinh tron: " + getArea() + " \n ";
    }

}
