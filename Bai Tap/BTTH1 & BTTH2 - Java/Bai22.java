package BaiTap;

import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        int n, m;
        Scanner nhapdl = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = nhapdl.nextInt();
        System.out.println("Nhap m:");
        m = nhapdl.nextInt();
        int a = (m*n) / UCLN(m,n);
        System.out.println("Boi chung nho nhat: " + a);
    }

    public static int UCLN (int n, int m){
        int ucln;
        while (n != m) {
            if(n > m) {
                n = n - m;
            }
            else if(m > n) {
                m=m-n;
            }
        }
        ucln = n;
        if(m == n) return n;
        return ucln;
    }
}
