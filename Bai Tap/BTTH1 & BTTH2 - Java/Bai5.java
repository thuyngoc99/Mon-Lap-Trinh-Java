package BTH1.java;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int n;
        float s = 0;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Nhap n:");
            n = x.nextInt();
        }
        while (n < 2);
        for(int i = 0; i <= n; i++){
            s+= 1.0/(2*i + 1);
        }
        System.out.println("Tong:" + s);
    }
}