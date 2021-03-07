package BaiTap;

import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
        int n;
        Scanner nhapdl = new Scanner(System.in);
        System.out.println("Nhap nam:");
        n = nhapdl.nextInt();
        if(ktraNamNhuan(n))
            System.out.println(n + " la nam nhuan ");
        else
            System.out.println(n + " khong phai nam nhuan ");
    }
    public static boolean ktraNamNhuan(int year){
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
}

