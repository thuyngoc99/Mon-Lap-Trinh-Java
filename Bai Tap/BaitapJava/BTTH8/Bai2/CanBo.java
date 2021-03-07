package Bai2;

import java.util.Scanner;

public class CanBo {
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String hoTen, int namSinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = nhap.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = nhap.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = nhap.nextLine();
    }

    @Override
    public String toString() {
        return "hoTen: " + hoTen + ", namSinh: " + namSinh + ", gioiTinh: " + gioiTinh + ", diaChi: " + diaChi + ", ";
    }
}
