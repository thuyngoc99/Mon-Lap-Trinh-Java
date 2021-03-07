package BTH1.java;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n;
        float s = 0;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Nhap n:");
            n = x.nextInt();
        }
        while (n <= 5);
        for(int i = 0; i <= n; i++){
            s+= (float)(2*i+1)/(2*i+2);
        }
        System.out.println("Tong:" + s);
    }
}