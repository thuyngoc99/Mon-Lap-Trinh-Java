package Bai4;

import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        System.out.println("============== Nhap thi sinh ===================");
        tuyenSinh.nhapThiSinh();
        System.out.println("============== Hien thi sinh ====================");
        tuyenSinh.hienThiSinh();
        System.out.println("============== Tim kiem thi sinh theo so bao danh ================");
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so bao danh thi sinh can tim: ");
        String soBaoDanh = nhap.nextLine();
        if (tuyenSinh.timKiem(soBaoDanh).isEmpty()){
            System.out.println("Khong tim thay thi sinh");
        }
        else {
            Enumeration<ThiSinh> thisinh = tuyenSinh.timKiem(soBaoDanh).elements();
            while (thisinh.hasMoreElements()){
                System.out.println(thisinh.nextElement());
            }
        }
    }
}
