package BTH1.java;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
       int n;
        float s = 0;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Nhap n:");
            n = x.nextInt();
        }
        while (n < 7);
        for(int i = 1; i <= n; i++){
            s+= 1.0/i;
        }
        System.out.println("Tong:" + s);
    }
}
