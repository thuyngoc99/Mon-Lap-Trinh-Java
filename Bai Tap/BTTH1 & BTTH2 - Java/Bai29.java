package BaiTap;

import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        int n;
        Scanner nhapdl = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = nhapdl.nextInt();
        int m = n, l = n;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                    System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i || i == n) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}