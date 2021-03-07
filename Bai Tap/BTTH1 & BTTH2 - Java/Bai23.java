package BaiTap;

import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        int a, b;
        Scanner nhapdl = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = nhapdl.nextInt();
        System.out.println("Nhap b:");
        b = nhapdl.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem.");
            }
            else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
        else {
            System.out.println("Phuong trinh co nghiem:" + (float)-b / a);
        }
    }
}

