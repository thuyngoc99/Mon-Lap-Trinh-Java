package Bai2;

import java.util.Scanner;

public class CanBo {
    private String hoTen;
    private String namSinh;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String hoTen, String namSinh, String gioiTinh, String diaChi) {
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

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
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
        Scanner nhapDl = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = nhapDl.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = nhapDl.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = nhapDl.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = nhapDl.nextLine();
    }

    @Override
    public String toString() {
        return hoTen + " - " + namSinh + " - " + gioiTinh + " - " + diaChi + " - ";
    }
}

