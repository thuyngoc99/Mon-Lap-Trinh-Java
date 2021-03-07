package Bai3;

import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        System.out.println("================ Nhap tai lieu ==============");
        quanLySach.nhapTaiLieu();
        System.out.println("================ Hien tai lieu ===============");
        quanLySach.hienTaiLieu();
        System.out.println("================ Tim kiem tai lieu theo loai ===============");
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap loai tai lieu can tim: ");
        String loaiTaiLieu = nhap.nextLine();
        if (quanLySach.timkiem(loaiTaiLieu).isEmpty()){
            System.out.println("Khong tim thay tai lieu");
        }
        else {
            for (int i = 0; i < quanLySach.timkiem(loaiTaiLieu).size(); i++){
                System.out.println(quanLySach.timkiem(loaiTaiLieu).get(i).toString());
            }
        }
    }
}
