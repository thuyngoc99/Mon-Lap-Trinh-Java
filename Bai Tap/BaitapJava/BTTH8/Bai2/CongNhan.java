package Bai2;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan() {
    }

    public CongNhan(String hoTen, int namSinh, String gioiTinh, String diaChi, int bac) {
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
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap bac: ");
        bac = nhap.nextInt();
    }

    @Override
    public String toString() {
        return "CongNhan {" + super.toString() + "bac: " + bac + "}";
    }
}
