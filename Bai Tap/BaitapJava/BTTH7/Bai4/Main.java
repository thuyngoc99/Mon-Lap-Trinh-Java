package Bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        tuyenSinh.nhapThiSinh();
        tuyenSinh.hienThiSinh();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so bao danh thi sinh can tim: ");
        String soBaoDanh = nhap.nextLine();
        if (tuyenSinh.timKiem(soBaoDanh).isEmpty()){
            System.out.println("Khong tim thay thi sinh");
        }
        else {
            for (int i = 0; i < tuyenSinh.timKiem(soBaoDanh).size(); i++){
                System.out.println(tuyenSinh.timKiem(soBaoDanh).get(i).toString());
            }
        }
    }
}

