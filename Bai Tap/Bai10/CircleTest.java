package Bai10;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {

        int n;
        int x, y;
        double r;
        Scanner nhapDl = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = nhapDl.nextInt();

        Circle[] circle = new Circle[n];

        for (int i = 0; i < circle.length; i++){
            System.out.println("Hinh tron thu " + (i + 1));
            System.out.println("Nhap x: ");
            x = nhapDl.nextInt();
            System.out.println("Nhap y: ");
            y = nhapDl.nextInt();
            System.out.println("Nhap ban kinh r: ");
            r = nhapDl.nextDouble();
            circle[i] = new Circle(x,y,r);
        }

        for (int i = 0; i < circle.length; i++){
            System.out.println("Hinh tron thu " + (i + 1));
            System.out.println("Duong kinh " + (double) Math.round(circle[i].getDiameter() * 100)/100);
            System.out.println("Chu vi " + (double) Math.round(circle[i].getCircumference() * 100)/100);
            System.out.println("Dien tich " + (double) Math.round(circle[i].getArea() * 100)/100 );
            System.out.println();
        }
    }
}
