package Bai3;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
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

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap so phat hanh: ");
        soPhatHanh = nhapDL.nextInt();
        System.out.println("Nhap thang phat hanh: ");
        thangPhatHanh = nhapDL.nextInt();
    }

    @Override
    public String loai() {
        return TapChi.class.getSimpleName();
    }

    @Override
    public String toString() {
        return "Tap chi " + super.toString() + soPhatHanh + " - " + thangPhatHanh + "}";
    }
}
