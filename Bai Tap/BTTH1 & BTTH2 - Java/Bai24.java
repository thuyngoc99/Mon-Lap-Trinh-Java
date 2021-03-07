package BaiTap;

import java.util.Scanner;

public class Bai24 {
    public static void main(String[] args) {
        int a, b,c;
        float delta;
        Scanner nhapdl = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = nhapdl.nextInt();
        System.out.println("Nhap b:");
        b = nhapdl.nextInt();
        System.out.println("Nhap c:");
        c = nhapdl.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem.");
            }
            else {
                System.out.println("Phuong trinh co nghiem:" + (float) -c / b);
            }
        }
        else {
            delta = b*b - 4*a*c;
            if(delta > 0) {
                float x1 = (float)((-b + Math.sqrt(delta))/(2*a));
                float x2 = (float)((-b - Math.sqrt(delta))/(2*a));
                    System.out.println("Phuong trinh co 2 nghiem: x1: " + x1  + ", x2: " + x2);
            }
            else if(delta == 0) {
                System.out.println("Phuong trinh co nghiem kep:" + (float)-b/(2*a));
            }
            else{
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
    }
}

