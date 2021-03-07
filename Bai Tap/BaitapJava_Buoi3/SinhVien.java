package BaitapJava_Buoi3;

import java.util.Scanner;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLyThuyet, diemThucHanh;

    public SinhVien() {
    }

    public SinhVien(int maSV, String hoTen, float diemLyThuyet, float diemThucHanh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(float diemLyThuyet) {
        this.diemLyThuyet = diemLyThuyet;
    }

    public float getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(float diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }

    @Override
    public String toString() {
        return "Ma sinh vien: " + getMaSV()  + " , ho ten: " + getHoTen()
                + " , diem ly thuyet: " + getDiemLyThuyet() + " , diem thuc hanh: " + getDiemThucHanh();
    }

    public static void main(String[] args) {
        int maSV;
        String hoTen;
        float diemLyThuyet, diemThucHanh, diemTrungBinh;
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        maSV = Integer.parseInt(nhapDL.nextLine());
        System.out.println("Nhap ho ten: ");
        hoTen = nhapDL.nextLine();
        System.out.println("Nhap diem ly thuyet va diem thuc hanh: ");
        diemLyThuyet = nhapDL.nextFloat();
        diemThucHanh = nhapDL.nextFloat();
        SinhVien sinhVien = new SinhVien(maSV,hoTen,diemLyThuyet,diemThucHanh);
        diemTrungBinh = (diemLyThuyet + diemThucHanh)/2;

        System.out.println(sinhVien.toString());
        System.out.println("Diem TB: " + diemTrungBinh);
        System.out.print("Ket qua: ");
        if(diemTrungBinh >= 5){
            System.out.print("Đậu");
        }
        else{
            System.out.print("Rớt");
        }
    }
}
