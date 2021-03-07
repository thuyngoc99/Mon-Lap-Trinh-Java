package BaiTap;

import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        int n;
        Scanner nhapdl = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = nhapdl.nextInt();

        if (ktraSoNgto(n) == 1) {
            System.out.println(n + " la so nguyen to ");
        }
        else {
            System.out.println(n + " khong phai so nguyen to ");
        }
    }

    public static int ktraSoNgto(int n){
        int d = 0;
        if(n < 2){
            return 0;
        }
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                d++;
            }
        }
        if(d == 2) {
            return 1;
        }
        else return 0;
    }
}
