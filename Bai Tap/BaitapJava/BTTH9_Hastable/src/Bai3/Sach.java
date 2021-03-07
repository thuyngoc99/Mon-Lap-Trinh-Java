package Bai3;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ten tac gia: ");
        tenTacGia = nhap.nextLine();
        System.out.println("Nhap so trang: ");
        soTrang = nhap.nextInt();
    }

    @Override
    public void hien() {
        super.hien();
        System.out.println("Ten tac gia: " + tenTacGia);
        System.out.println("So trang: " + soTrang);
        System.out.print("\n");
    }

    @Override
    public String toString() {
        return "Sach {" + super.toString() + "tenTacGia: " + tenTacGia + ", soTrang: " + soTrang + "}";
    }

    @Override
    public String loaiTaiLieu() {
        return Sach.class.getSimpleName();
    }
}

