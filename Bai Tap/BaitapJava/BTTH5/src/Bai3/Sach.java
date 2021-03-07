package Bai3;

import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
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
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap ten tac gia: ");
        tenTacGia = nhapDL.nextLine();
        System.out.println("Nhap so trang: ");
        soTrang = nhapDL.nextInt();
    }

    @Override
    public String loai() {
        return Sach.class.getSimpleName();
    }

    @Override
    public String toString() {
        return "Sach " + super.toString() + tenTacGia + " - " + soTrang + "}";
    }

}
