package Bai13;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}
