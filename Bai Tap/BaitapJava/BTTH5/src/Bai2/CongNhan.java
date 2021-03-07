package Bai2;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan() {
    }

    public CongNhan(String hoTen, String namSinh, String gioiTinh, String diaChi, int bac) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner nhapDl = new Scanner(System.in);
        System.out.println("Nhap bac: ");
        bac = nhapDl.nextInt();
    }


    @Override
    public String toString() {
        return "Cong nhan " + super.toString() + bac;
    }
}

