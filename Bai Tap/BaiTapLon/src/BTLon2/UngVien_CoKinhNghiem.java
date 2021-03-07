package BTLon2;

import java.io.Serializable;
import java.util.Scanner;

public class UngVien_CoKinhNghiem extends UngVien implements Serializable {
    private float soNamKinhNghiem;
    private String kyNangChuyenMon;
    private String noiLamViecGanNhat;

    public UngVien_CoKinhNghiem() {
    }

    public UngVien_CoKinhNghiem(String hoTen, String namSinh, String diaChi, String queQuan, String soDT, String email, float soNamKinhNghiem, String kyNangChuyenMon, String noiLamViecGanNhat) {
        super(hoTen, namSinh, diaChi, queQuan, soDT, email);
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.kyNangChuyenMon = kyNangChuyenMon;
        this.noiLamViecGanNhat = noiLamViecGanNhat;
    }

    public float getSoNamKinhNghiem() {
        return soNamKinhNghiem;
    }

    public void setSoNamKinhNghiem(float soNamKinhNghiem) {
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    public String getKyNangChuyenMon() {
        return kyNangChuyenMon;
    }

    public void setKyNangChuyenMon(String kyNangChuyenMon) {
        this.kyNangChuyenMon = kyNangChuyenMon;
    }

    public String getNoiLamViecGanNhat() {
        return noiLamViecGanNhat;
    }

    public void setNoiLamViecGanNhat(String noiLamViecGanNhat) {
        this.noiLamViecGanNhat = noiLamViecGanNhat;
    }
}
