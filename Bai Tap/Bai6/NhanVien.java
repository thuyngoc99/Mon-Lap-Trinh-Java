package Bai6;

import java.util.Random;
import java.util.Scanner;

public class NhanVien {

    private int maNV;
    private String hoTen;
    private String diaChi;
    private Boolean CBQL;

    public NhanVien() {
    }

    public NhanVien(int maNV, String hoTen, String diaChi, Boolean CBQL) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.CBQL = CBQL;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Boolean isCBQL() {
        return CBQL;
    }

    public void setCBQL(Boolean CBQL) {
        this.CBQL = CBQL;
    }

    @Override
    public String toString() {
        return "Ma nhan vien: " + maNV + " - Ho ten: " + hoTen + " - Dia chi: " + diaChi + " - Can bo quan ly: " + CBQL;
    }

    public void nhap(){
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        maNV = Integer.parseInt(nhapDL.nextLine());
        System.out.println("Nhap ho ten: ");
        hoTen = nhapDL.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = nhapDL.nextLine();
        Random random = new Random();
        CBQL = random.nextBoolean();
    }


    public static void main(String[] args) {

        NhanVien[] nhanvien = new NhanVien[4];

        for (int i = 0; i < 4; i++) {
            nhanvien[i] = new NhanVien();
            System.out.println("Nhap nhan vien thu " + (i + 1));
            nhanvien[i].nhap();
        }

        for (int i = 0; i < 4; i++) {
            if (nhanvien[i].isCBQL()) {
                System.out.println(nhanvien[i].toString());
            }
        }
    }
}

