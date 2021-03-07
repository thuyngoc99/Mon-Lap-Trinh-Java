package BTLon2;

import java.io.Serializable;
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
}
