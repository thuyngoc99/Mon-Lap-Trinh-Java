package BTH1.java;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        int n;
        int gt = 1;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Nhap n:");
            n = x.nextInt();
        }
        while (n < 0);
        for(int i = 1; i <= n; i++){
            gt*= i;
        }
        System.out.println("Giai thua:" + gt);
    }
}