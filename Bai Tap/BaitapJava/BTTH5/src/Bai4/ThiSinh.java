package Bai4;

import java.util.Scanner;

public class ThiSinh {
    private int soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String uuTien;

    public ThiSinh() {
    }

    public ThiSinh(int soBaoDanh, String hoTen, String diaChi, String uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getUuTien() {
        return uuTien;
    }

    public void setUuTien(String uuTien) {
        this.uuTien = uuTien;
    }

    public void nhap(){
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap so bao danh: ");
        soBaoDanh = Integer.parseInt(nhapDL.nextLine());
        System.out.println("Nhap ho ten: ");
        hoTen = nhapDL.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = nhapDL.nextLine();
        System.out.println("Nhap uu tien: ");
        uuTien = nhapDL.nextLine();
    }

    @Override
    public String toString() {
        return "{" + soBaoDanh + " - " + hoTen + " - " + diaChi + " - " + uuTien + " - " ;
    }

}
