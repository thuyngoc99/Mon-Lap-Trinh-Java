package BTH1.java;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        int n;
        int dem = 0, demchan = 0, demle = 0;
        Scanner x = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = x.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                dem++;

            if (n % i == 0 && i % 2 == 0) {
                demchan++;
            }

            if (n % i == 0 && i % 2 != 0) {
                demle++;
            }
        }
        System.out.println("So luong uoc so: " + dem + " \nUoc so chan: " + demchan + " \nUoc so le: " + demle);
    }
}
