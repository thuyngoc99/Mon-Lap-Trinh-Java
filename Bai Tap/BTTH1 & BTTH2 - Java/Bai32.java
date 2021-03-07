package BaiTap;

import java.util.Scanner;

public class Bai32 {
    public static void main(String[] args) {
        int hang, cot;
        Scanner nhapdl = new Scanner(System.in);
        System.out.println("Nhập số hàng:");
        hang = nhapdl.nextInt();
        System.out.println("Nhập số cột:");
        cot = nhapdl.nextInt();
        for (int i = 1; i <= hang; i++) {
            for (int j = 1; j <= cot; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}