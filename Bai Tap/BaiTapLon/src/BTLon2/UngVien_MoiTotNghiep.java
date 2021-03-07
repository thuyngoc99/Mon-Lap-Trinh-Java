package BTLon2;

import java.io.Serializable;
import java.util.Scanner;

public class UngVien_MoiTotNghiep extends UngVien implements Serializable {
    private String thoiDiemTotNghiep;
    private String xepLoaiTotNghiep;
    private String truongTotNghiep;

    public UngVien_MoiTotNghiep() {
    }

    public UngVien_MoiTotNghiep(String hoTen, String namSinh, String diaChi, String queQuan, String soDT, String email, String thoiDiemTotNghiep, String xepLoaiTotNghiep, String truongTotNghiep) {
        super(hoTen, namSinh, diaChi, queQuan, soDT, email);
        this.thoiDiemTotNghiep = thoiDiemTotNghiep;
        this.xepLoaiTotNghiep = xepLoaiTotNghiep;
        this.truongTotNghiep = truongTotNghiep;
    }

    public String getThoiDiemTotNghiep() {
        return thoiDiemTotNghiep;
    }

    public void setThoiDiemTotNghiep(String thoiDiemTotNghiep) {
        this.thoiDiemTotNghiep = thoiDiemTotNghiep;
    }

    public String getXepLoaiTotNghiep() {
        return xepLoaiTotNghiep;
    }

    public void setXepLoaiTotNghiep(String xepLoaiTotNghiep) {
        this.xepLoaiTotNghiep = xepLoaiTotNghiep;
    }

    public String getTruongTotNghiep() {
        return truongTotNghiep;
    }

    public void setTruongTotNghiep(String truongTotNghiep) {
        this.truongTotNghiep = truongTotNghiep;
    }
}
