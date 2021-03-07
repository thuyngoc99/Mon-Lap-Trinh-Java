package TTCS;

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

    @Override
    public void nhapUngVien() {
        super.nhapUngVien();
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap so nam kinh nghiem cua ung vien:");
        soNamKinhNghiem = Float.parseFloat(nhapDL.nextLine());
        System.out.println("Nhap ky nang chuyen mon cua ung vien:");
        kyNangChuyenMon = nhapDL.nextLine();
        System.out.println("Nhap noi lam viec gan nhat cua ung vien:");
        noiLamViecGanNhat = nhapDL.nextLine();
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.print(", " + soNamKinhNghiem + ", " + kyNangChuyenMon + ", " + noiLamViecGanNhat);
    }

    @Override
    public String toString() {
        return super.toString() +  ", " + soNamKinhNghiem + ", " + kyNangChuyenMon + ", " + noiLamViecGanNhat;
    }
}
