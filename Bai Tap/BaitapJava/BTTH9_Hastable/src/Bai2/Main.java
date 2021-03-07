package Bai2;

import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLCB quanLy = new QLCB();
        System.out.println("==================== Nhap can bo ===================");
        quanLy.nhapCanBo();
        System.out.println("==================== Hien can bo ====================");
        quanLy.hienCanBo();
        System.out.println("==================== Tim kiem can bo ===================");
        System.out.println("Nhap id can tim: ");
        String id = (new Scanner(System.in)).nextLine();
        if (quanLy.timKiemTheoId(id).isEmpty()){
            System.out.println("Khong tim thay id nay");
        }
        else {
            Enumeration<CanBo> canbo = quanLy.timKiemTheoId(id).elements();
            while (canbo.hasMoreElements()){
                System.out.println(canbo.nextElement());
            }
        }
    }
}
