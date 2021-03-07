package Bai2;

import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        qlcb.nhapCanBo();
        qlcb.hienCanBo();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ten can tim kiem: ");
        String name = nhap.nextLine();
        if (qlcb.timKiem(name).isEmpty()){
            System.out.println("Khong tim thay can bo");
        }
        else {
            for (int i = 0; i < qlcb.timKiem(name).size(); i++) {
                System.out.println(qlcb.timKiem(name).get(i).toString());
            }
        }
    }
}