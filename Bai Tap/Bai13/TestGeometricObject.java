package Bai13;

public class TestGeometricObject {

    Circle circle = new Circle(4);
    Rectangle rectangle = new Rectangle(2,3);

    public void sosanh(){
        if(circle.getArea() > rectangle.getArea()){
            System.out.println("Dien tich hinh tron lon hon.");
        }
        else
        {
            System.out.println("Dien tich hinh chu nhat lon hon.");
        }
    }

    public void display(){
        //dien tich va chu vi cua hinh tron
        System.out.println("Dien tich hinh tron: " + circle.getArea());
        System.out.println("Chu vi hinh tron: " + circle.getPerimeter());
        System.out.println("");

        //dien tich va chu vi cua hinh chu nhat
        System.out.println("Dien tich hinh chu nhat: " + rectangle.getArea());
        System.out.println("Chu vi hinh chu nhat: " + rectangle.getPerimeter());
    }

    public static void main(String[] args) {
        TestGeometricObject testGeometricObject = new TestGeometricObject();
        testGeometricObject.display();
        testGeometricObject.sosanh();
    }
}

