package BTH1.java;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        int n;
        Scanner x = new Scanner(System.in);
            System.out.println("Nhap n:");
            n = x.nextInt();
        System.out.println("Uoc so cua " +n +" la:");
        for(int i = 1; i <= n; i++){
            if(n%i == 0)
                System.out.print(+ i +"  ");
        }
    }
}
