package Bai3;

import java.util.Scanner;

public abstract class TaiLieu {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu: ");
        maTaiLieu = nhap.nextLine();
        System.out.println("Nhap ten nha xuat ban: ");
        tenNhaXuatBan = nhap.nextLine();
        System.out.println("Nhap so ban phat hanh: ");
        soBanPhatHanh = Integer.parseInt(nhap.nextLine());
    }

    public void hien(){
        System.out.println("Ma tai lieu: " + maTaiLieu);
        System.out.println("Ten nha xuat ban: " + tenNhaXuatBan);
        System.out.println("So ban phat hanh: " + soBanPhatHanh);
    }

    @Override
    public String toString() {
        return "maTaiLieu: " + maTaiLieu + ", tenNhaXuatBan: " + tenNhaXuatBan + ", soBanPhatHanh: " + soBanPhatHanh + ", ";
    }

    public abstract String loaiTaiLieu();
}

