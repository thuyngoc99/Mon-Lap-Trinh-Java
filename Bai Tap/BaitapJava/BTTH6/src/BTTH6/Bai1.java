package BTTH6;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap xau ky tu: ");
        String xau = sc.nextLine();
        System.out.println("Nhap ky tu: ");
        char kytu = (char) sc.nextLine().charAt(0);

        int dem = 0;
        for (int i = 0; i < xau.length(); i++) {
            if (xau.charAt(i) == kytu) {
                dem++;
            }
        }
        System.out.println("So lan xuat hien cua " + kytu + " bang: " + dem);
    }

}

