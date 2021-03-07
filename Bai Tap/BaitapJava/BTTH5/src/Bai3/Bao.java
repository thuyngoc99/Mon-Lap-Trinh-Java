package Bai3;

import java.util.Scanner;

public class Bao extends TaiLieu{
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
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap thang phat hanh: ");
        ngayPhatHanh = nhapDL.nextLine();
    }

    @Override
    public String loai() {
        return Bao.class.getSimpleName();
    }

    @Override
    public String toString() {
        return "Bao " + super.toString() + ngayPhatHanh + "}";
    }
}
