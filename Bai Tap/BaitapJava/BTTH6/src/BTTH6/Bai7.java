package BTTH6;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String xau = nhap.nextLine();
        String str = xau.replaceAll("\\s+"," ");
        System.out.println(str);
    }
}
