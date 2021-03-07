package Bai2;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String id, String hoTen, int namSinh, String gioiTinh, String diaChi, String congViec) {
        super(id, hoTen, namSinh, gioiTinh, diaChi);
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
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap cong viec: ");
        congViec = nhap.nextLine();
    }

    @Override
    public String toString() {
        return "NhanVien {" + super.toString() + "congViec: " + congViec + "}";
    }
}
