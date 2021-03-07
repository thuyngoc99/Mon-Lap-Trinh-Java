package BTH1.java;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int n;
        int s = 0;
        Scanner x = new Scanner(System.in);
        do{
        System.out.println("Nhap n:");
        n = x.nextInt();
        }
        while (n <= 3 || n >= 50);
        for(int i = 1; i <= n ; i++){
            s+= i;
        }
        System.out.println("Tong:" + s);
    }
}
