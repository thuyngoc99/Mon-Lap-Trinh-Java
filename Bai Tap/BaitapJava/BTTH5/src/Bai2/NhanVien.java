package Bai2;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String namSinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner nhapDl = new Scanner(System.in);
        System.out.println("Nhap cong viec: ");
        congViec = nhapDl.nextLine();
    }

    @Override
    public String toString() {
        return "Nhan vien" + super.toString() + congViec;
    }
}

