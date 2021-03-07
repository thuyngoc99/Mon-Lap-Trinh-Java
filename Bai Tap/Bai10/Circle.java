package Bai10;

public class Circle extends Point {
    private double radius;

    public Circle() {
    }

    public Circle(int xValue, int yValue, double radiusValue) {
        super(xValue, yValue);
        this.radius = radiusValue;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radiusValue) {
        this.radius = radiusValue;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getCircumference(){
        return 2 * 3.14 * radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        super.toString();
        return "Circle[" + "radius: " + radius + ']';
    }
}
