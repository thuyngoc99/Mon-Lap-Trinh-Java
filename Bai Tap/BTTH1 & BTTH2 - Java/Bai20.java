package BaiTap;

import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        int n;
        Scanner nhapdl = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = nhapdl.nextInt();

        if (ktraSoChinhPhuong(n)) {
            System.out.println(n + " la so chinh phuong ");
        }
        else {
            System.out.println(n + " khong phai so chinh phuong ");
        }
    }

    public static boolean ktraSoChinhPhuong(int n){
        double a = Math.sqrt(n) ;
        return ((a - Math.floor(a)) == 0);
    }
}
