package TTCS;

import java.io.Serializable;
import java.util.Scanner;

public class SinhVienThucTap extends UngVien implements Serializable {
    private String chuyenNghanhDangHoc;
    private int hocKyDangHoc;
    private String tenTruongDangHoc;
    private String ngayDuKienTotNghiep;

    public  SinhVienThucTap(){}

    public SinhVienThucTap(String hoTen, String namSinh, String diaChi, String queQuan, String soDT, String email, String chuyenNghanhDangHoc, int hocKyDangHoc, String tenTruongDangHoc, String ngayDuKienTotNghiep) {
        super(hoTen, namSinh, diaChi, queQuan, soDT, email);
        this.chuyenNghanhDangHoc = chuyenNghanhDangHoc;
        this.hocKyDangHoc = hocKyDangHoc;
        this.tenTruongDangHoc = tenTruongDangHoc;
        this.ngayDuKienTotNghiep = ngayDuKienTotNghiep;
    }

    public String getChuyenNghanhDangHoc() {
        return chuyenNghanhDangHoc;
    }

    public void setChuyenNghanhDangHoc(String chuyenNghanhDangHoc) {
        this.chuyenNghanhDangHoc = chuyenNghanhDangHoc;
    }

    public int getHocKyDangHoc() {
        return hocKyDangHoc;
    }

    public void setHocKyDangHoc(int hocKyDangHoc) {
        this.hocKyDangHoc = hocKyDangHoc;
    }

    public String getTenTruongDangHoc() {
        return tenTruongDangHoc;
    }

    public void setTenTruongDangHoc(String tenTruongDangHoc) {
        this.tenTruongDangHoc = tenTruongDangHoc;
    }

    public String getNgayDuKienTotNghiep() {
        return ngayDuKienTotNghiep;
    }

    public void setNgayDuKienTotNghiep(String ngayDuKienTotNghiep) {
        this.ngayDuKienTotNghiep = ngayDuKienTotNghiep;
    }

    @Override
    public void nhapUngVien() {
        super.nhapUngVien();
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap chuyen nganh dang hoc cua ung vien:");
        chuyenNghanhDangHoc = nhapDL.nextLine();
        System.out.println("Nhap hoc ky dang hoc cua ung vien:");
        hocKyDangHoc = Integer.parseInt(nhapDL.nextLine());
        System.out.println("Nhap ten truong dang hoc cua ung vien:");
        tenTruongDangHoc = nhapDL.nextLine();
        System.out.println("Nhap ngay du kien tot nghiep cua ung vien:");
        ngayDuKienTotNghiep = nhapDL.nextLine();
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.print(" , " + chuyenNghanhDangHoc + ", " + hocKyDangHoc + ", " + tenTruongDangHoc + ", " + ngayDuKienTotNghiep);
    }

    @Override
    public String toString() {
        return  super.toString() +  " , " + chuyenNghanhDangHoc + ", " + hocKyDangHoc
                + ", " + tenTruongDangHoc + ", " + ngayDuKienTotNghiep;
    }
}
