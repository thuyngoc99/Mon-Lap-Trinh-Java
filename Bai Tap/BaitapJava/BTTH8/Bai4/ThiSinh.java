package Bai4;

import java.util.Scanner;

public class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String uuTien;

    public ThiSinh() {
    }

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
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
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so bao danh: ");
        soBaoDanh = nhap.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = nhap.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = nhap.nextLine();
        System.out.println("Nhap uu tien: ");
        uuTien = nhap.nextLine();
    }

    @Override
    public String toString() {
        return "soBaoDanh: " + soBaoDanh + ", hoTen: " + hoTen + ", diaChi: " + diaChi + ", uuTien: " + uuTien + ", ";
    }

    public void hien(){
        System.out.println("SBD: " + soBaoDanh);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Uu tien: " + uuTien);
        System.out.print("\n");
    }
}

