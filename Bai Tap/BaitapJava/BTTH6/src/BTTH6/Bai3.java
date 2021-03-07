package BTTH6;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        System.out.println("Nhap xau: ");
        String chuoi = new Scanner(System.in).nextLine();
        String a = new StringBuffer(chuoi).reverse().toString();
        System.out.println(a);
    }

}
