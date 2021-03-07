package BaiTap;

import java.util.Scanner;

public class Bai28 {
    public static void main(String[] args) {
        int n;
        Scanner nhapdl = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = nhapdl.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

