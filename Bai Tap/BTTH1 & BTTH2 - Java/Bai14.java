package BTH1.java;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        int n,x;
        long s = 0;
        Scanner luyThua = new Scanner(System.in);
        do{
            System.out.println("Nhap n:");
            n = luyThua.nextInt();
            System.out.println("Nhap x:");
            x = luyThua.nextInt();
        }
        while (n < 0);
        for(int i = 0; i <= n; i++){
            s+= Math.pow(x,2*i + 1);
        }
        System.out.println("Tong luy thua:" + s);
    }
}