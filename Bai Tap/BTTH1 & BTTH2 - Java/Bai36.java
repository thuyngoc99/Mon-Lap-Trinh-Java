package BaiTap;

import java.util.Scanner;

public class Bai36 {
    public static void main(String[] args) {
        float so1, so2;
        Scanner nhapdl = new Scanner(System.in);
        System.out.println("Nhap so 1: ");
        so1 = nhapdl.nextFloat();
        System.out.println("Nhap so 2: ");
        so2 = nhapdl.nextFloat();

        double Tong = so1 + so2;
        double Hieu = so1 - so2;
        double Tich = so1 * so2;
        double Thuong = so1 / so2;
        double chiaDu = so1 % so2;

        System.out.println("Tong hai so thuc: " + so1 + " + " + so2 + " = " + Tong);
        System.out.println("Hieu hai so thuc: " + so1 + " - " + so2 + " = " + Hieu);
        System.out.println("Tich hai so thuc: " + so1 + " * " + so2 + " = " + Tich);
        System.out.println("Thuong hai so thuc: " + so1 + " / " + so2 + " = " + Thuong);
        System.out.println("Chia lay phan du hai so thuc: " + so1 + " % " + so2 + " = " + chiaDu);

    }
}
