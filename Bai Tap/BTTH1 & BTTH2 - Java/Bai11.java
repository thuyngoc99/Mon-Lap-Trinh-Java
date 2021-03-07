package BTH1.java;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        int n;
        long s = 0;
        int giaithua = 1;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Nhap n:");
            n = x.nextInt();
        }
        while (n <= 0);
        for(int i = 1; i <= n; i++){
            giaithua*= i;
            s+= giaithua;
        }
        System.out.println("Tong giai thua:" + (long)s);
    }
}