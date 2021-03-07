package BTTH6;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ho ten nguoi: ");
        String hoten = nhap.nextLine();
        String[] str = hoten.split(" ");
        int dem = -1;
        while (++dem < hoten.length()){
            System.out.println(str[dem].charAt(0));
        }
    }
}
