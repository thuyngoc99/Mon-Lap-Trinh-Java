package Bai10;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int xValue, int yValue) {
        this.x = xValue;
        this.y = yValue;
    }

    public int getX() {
        return x;
    }

    public void setX(int xValue) {
        this.x = xValue;
    }

    public int getY() {
        return y;
    }

    public void setY(int yValue) {
        this.y = yValue;
    }

    @Override
    public String toString() {
        return "Point[" + "x: " + x + ", y: " + y + ']';
    }
}
