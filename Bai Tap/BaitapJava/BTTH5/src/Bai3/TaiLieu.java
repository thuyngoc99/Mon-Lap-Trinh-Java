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

    public void nhap() {
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu: ");
        maTaiLieu = nhapDL.nextLine();
        System.out.println("Nhap ten nha xuat ban: ");
        tenNhaXuatBan = nhapDL.nextLine();
        System.out.println("Nhap so ban phat hanh: ");
        soBanPhatHanh = nhapDL.nextInt();
    }

    public abstract String loai();

    @Override
    public String toString() {
        return "{" + getMaTaiLieu() + " - " + getTenNhaXuatBan() + " - " + getSoBanPhatHanh() + " - ";
    }
}

