package Bai3;

import java.util.Scanner;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao() {
    }

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ngay phat hanh: ");
        ngayPhatHanh = nhap.nextLine();
    }

    @Override
    public void hien() {
        super.hien();
        System.out.println("Ngay phat hanh: " + ngayPhatHanh);
        System.out.print("\n");
    }

    @Override
    public String toString() {
        return "Bao {" + super.toString() + "ngayPhatHanh: " + ngayPhatHanh + "}";
    }

    @Override
    public String loaiTaiLieu() {
        return Bao.class.getSimpleName();
    }
}

