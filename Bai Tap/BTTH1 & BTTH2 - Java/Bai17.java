package BTH1.java;

import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        int n;
        long s1 = 0, s2 = 1;
        Scanner x = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = x.nextInt();

        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                s1+= i;
                s2*= i;
            }
        }
            System.out.println("Tong: " +  s1 + "\nTich: " + s2);
    }
}
