package BTH1.java;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        int s = 0;
        Scanner x=new Scanner(System.in);
        do{
            System.out.println("Nhap n:");
            n=x.nextInt();
        }
        while (n < 5 || n > 20);
        for(int i = 1; i <= n; i++){
            s+= i*i;
        }
        System.out.println("Tong:" + s);
    }
}
