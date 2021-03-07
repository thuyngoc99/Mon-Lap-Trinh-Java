package BTLon2;

import java.io.Serializable;
import java.util.Scanner;

public class SinhVienThucTap extends UngVien implements Serializable {
    private String chuyenNghanhDangHoc;
    private String hocKyDangHoc;
    private String tenTruongDangHoc;
    private String ngayDuKienTotNghiep;

    public SinhVienThucTap() {
    }

    public SinhVienThucTap(String hoTen, String namSinh, String diaChi, String queQuan, String soDT, String email, String chuyenNghanhDangHoc, String hocKyDangHoc, String tenTruongDangHoc, String ngayDuKienTotNghiep) {
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

    public String getHocKyDangHoc() {
        return hocKyDangHoc;
    }

    public void setHocKyDangHoc(String hocKyDangHoc) {
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
}
