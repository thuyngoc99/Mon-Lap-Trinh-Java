package TTCS;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Paths;
import java.util.Scanner;

public class UngVien implements Serializable {
    private String hoTen;
    private String ngayThangNamSinh;
    private String diaChi;
    private String queQuan;
    private String soDT;
    private String email;

    public UngVien() {
    }

    public UngVien(String hoTen, String ngayThangNamSinh, String diaChi, String queQuan, String soDT, String email) {
        this.hoTen = hoTen;
        this.ngayThangNamSinh = ngayThangNamSinh;
        this.diaChi = diaChi;
        this.queQuan = queQuan;
        this.soDT = soDT;
        this.email = email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setNgayThangNamSinh(String ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void nhapUngVien(){
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap ten ung vien:");
        hoTen = nhapDL.nextLine();
        System.out.println("Nhap ngay thang nam sinh cua ung vien:");
        ngayThangNamSinh = (nhapDL.nextLine());
        System.out.println("Nhap dia chi ung vien:");
        diaChi = nhapDL.nextLine();
        System.out.println("Nhap que quan ung vien:");
        queQuan = nhapDL.nextLine();
        System.out.println("Nhap so dien thoai ung vien:");
        soDT = nhapDL.nextLine();
        System.out.println("Nhap email ung vien:");
        email = nhapDL.nextLine();
    }

    public void inThongTin(){
        System.out.print(hoTen + ", " + ngayThangNamSinh + ", " + diaChi + ", " + queQuan + ", " + soDT + ", " + email);
    }

    @Override
    public String toString() {
        return hoTen + ", " + ngayThangNamSinh + ", " + diaChi + ", " + queQuan + ", " + soDT + ", " + email;
    }
}
