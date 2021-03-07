package Bai3;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private String thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, String thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so phat hanh: ");
        soPhatHanh = Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap thang phat hanh: ");
        thangPhatHanh = nhap.nextLine();
    }

    @Override
    public void hien() {
        super.hien();
        System.out.println("So phat hanh: " + soPhatHanh);
        System.out.println("Thang phat hanh: " + thangPhatHanh);
        System.out.print("\n");
    }

    @Override
    public String toString() {
        return "TapChi {" + super.toString() + "soPhatHanh: " + soPhatHanh + ", thangPhatHanh: " + thangPhatHanh + "}";
    }

    @Override
    public String loaiTaiLieu() {
        return TapChi.class.getSimpleName();
    }
}

