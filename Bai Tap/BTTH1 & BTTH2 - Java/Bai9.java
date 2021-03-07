package BTH1.java;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        int n;
        int giaithua = 1;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Nhap n:");
            n = x.nextInt();
        }
        while (n <= 6);
        for(int i=1;i<=n;i++){
            giaithua*= i;
        }
        System.out.println("Tong:" + giaithua);
    }
}
