package BTTH6;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ho ten nguoi: ");
        String hoten = nhap.nextLine();
        hoten = hoten.trim();
        if(hoten.startsWith("Tran")){
            System.out.println("La ho Tran");
        }
        else {
            System.out.println("Khong phai ho Tran");
        }
    }
}

