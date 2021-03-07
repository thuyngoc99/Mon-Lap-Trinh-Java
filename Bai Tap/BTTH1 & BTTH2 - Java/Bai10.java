package BTH1.java;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        int n,x;
        Scanner luyThua = new Scanner(System.in);

        System.out.println("Nhap n:");
        n = luyThua.nextInt();
        System.out.println("Nhap x:");
        x = luyThua.nextInt();

        System.out.println("Luy thua:" + (int)Math.pow(x,n));
    }
}