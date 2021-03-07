package Bai8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CircleCollection {
    private Circle[] hinhtron;

    public CircleCollection(int n) {
        hinhtron = new Circle[n];
    }

    public void addCircle(Circle circle) {
        for(int i = 0; i < hinhtron.length; i++){
            if(hinhtron[i] == null){
                hinhtron[i] = circle;
                break;
            }
        }
    }

    public int getSize(){
        int sl = 0;
        for (int i = 0; i < hinhtron.length; i++){
            if(hinhtron[i] != null){
                sl++;
            }
        }
        return sl;
    }

    public Circle getCirle(int a){
        if(a < 0 || a >= hinhtron.length){
            return null;
        }
        return hinhtron[a];
    }

    public void setCircle(Circle circle, int a){
        if(a < 0 || a >= hinhtron.length){
            return;
        }
        hinhtron[a] = circle;
    }

    @Override
    public String toString() {
        return "CircleCollection " + Arrays.toString(hinhtron);
    }

    public float sumAreaCircle(){
        float sum = 0;
        for (int i = 0; i < hinhtron.length; i++){
            sum += hinhtron[i].getArea();
        }
        return sum;
    }

    public double maxArea(){
        double max = 0;
        for(int i = 0; i < hinhtron.length; i++){
            if(max < hinhtron[i].getArea()){
                max = hinhtron[i].getArea();
            }
        }
        return max;
    }

    public Circle getCircle_minArea(){
        Circle min = hinhtron[0];
        for(int i = 0; i < hinhtron.length; i++){
            if(min.getArea() > hinhtron[i].getArea()){
                min = hinhtron[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int n;
        int r;
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = nhapDL.nextInt();
        CircleCollection circleCollections = new CircleCollection(n);
        Circle[] circles = new Circle[n];
        Random random = new Random();

        for (int i = 0; i < circles.length; i++) {
            r = random.nextInt(10) + 1 ;
            circles[i] = new Circle();
            circles[i].setRadius(r);
        }

        for (int i = 0; i < circles.length; i++){
            circleCollections.addCircle(circles[i]);
        }

        //thong tin cua cac hinh tron
        System.out.println(circleCollections.toString());

        // tong dien tich cua cac hinh tron
        System.out.println("Tong dien tich cua cac hinh tron: " + circleCollections.sumAreaCircle());

        //dien tich lon nhat
        System.out.println("Dien tich lon nhat cua cac hinh tron: " + circleCollections.maxArea());

        //thong tin hinh tron co dien tich nho nhat
        System.out.println("Thong tin hinh tron co dien tich nho nhat: " + circleCollections.getCircle_minArea());

    }
}


