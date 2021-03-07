package BTH1.java;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        int n;
        float s = 0;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Nhap n:");
            n = x.nextInt();
        }
        while (n <= 0);
        for(int i = 1; i <= n; i++){
            s+= (float)i/(i+1);
        }
        System.out.println("Tong:" + s);
    }
}