package BaiTap;

import java.util.Scanner;

public class Bai27 {
    public static void main(String[] args) {
        int n;
        Scanner nhapdl = new Scanner(System.in);
        do {
            System.out.println("Nhap n:");
            n = nhapdl.nextInt();
        } while (n <= 0);
        System.out.println("Cac so nguyen le nho hon " + n + " : ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                if (i != 7 && i != 21 && i != 41) {
                    System.out.println(i);
                }
            }
        }
    }
}
