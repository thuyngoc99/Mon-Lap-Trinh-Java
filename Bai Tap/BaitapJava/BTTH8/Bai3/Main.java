package Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        quanLySach.nhapTaiLieu();
        quanLySach.hienTaiLieu();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap loai tai lieu can tim: ");
        String maTaiLieu = nhap.nextLine();
        if (quanLySach.timkiem(maTaiLieu).isEmpty()){
            System.out.println("Khong tim thay tai lieu");
        }
        else {
            for (int i = 0; i < quanLySach.timkiem(maTaiLieu).size(); i++){
                System.out.println(quanLySach.timkiem(maTaiLieu).get(i).toString());
            }
        }
    }
}
