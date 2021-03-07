package BaitapJava_Buoi3;

import java.util.Scanner;

public class CNhanVien {
    private String mHo, mTen;
    private int mSoSP;
    private double donGia;

    public CNhanVien() {
    }

    public CNhanVien(String ho, String ten, int soSP) {
        if (soSP < 0) {
            soSP = 0;
            return;
        }
        mHo = ho;
        mTen = ten;
        mSoSP = soSP;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        this.mSoSP = mSoSP;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    private double getLuong() {
        if (mSoSP >= 1 && mSoSP <= 99) {
            donGia = 0.5;
        }
        if (mSoSP >= 200 && mSoSP <= 399) {
            donGia = 0.55;
        }
        if (mSoSP >= 400 && mSoSP <= 599) {
            donGia = 0.6;
        }
        if (mSoSP > 600) {
            donGia = 0.65;
        }
        return mSoSP * donGia;
    }

    public boolean NhieuHon(CNhanVien nv2) {
        if (mSoSP > nv2.mSoSP) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        CNhanVien[] nv = new CNhanVien[2];

        String ho, ten;
        int soSP;

        for (int i = 0; i < 2; i++) {
            Scanner nhapDL = new Scanner(System.in);
            nv[i] = new CNhanVien();
            System.out.println("Nhap ho, ten, so sp cua nhan vien thu " + (i + 1));
            ho = nhapDL.nextLine();
            ten = nhapDL.nextLine();
            soSP = Integer.parseInt(nhapDL.nextLine());
            nv[i].setmHo(ho);
            nv[i].setmTen(ten);
            nv[i].setmSoSP(soSP);
        }

        System.out.println("Luong cua nhan vien 1 " + nv[0].getLuong());
        System.out.println("Luong cua nhan vien 2 " + nv[1].getLuong());


        System.out.println("Cach 1: Dung ham");
        if (nv[0].NhieuHon(nv[1])) {
            System.out.println("Nhan vien 1 co so san pham nhieu hon va nhieu hon la " + (nv[0].mSoSP - nv[1].mSoSP));
        }
        else {
            System.out.println("Nhan vien 2 co so san pham nhieu hon va nhieu hon la " + (nv[1].mSoSP - nv[0].mSoSP));
        }
        System.out.println("Cach 2: Khong dung ham");
        if (nv[0].mSoSP > nv[1].mSoSP) {
            System.out.println("Nhan vien 1 co so san pham nhieu hon va nhieu hon la " + (nv[0].mSoSP - nv[1].mSoSP));
        }
        else {
            System.out.println("Nhan vien 2 co so san pham nhieu hon va nhieu hon la " + (nv[1].mSoSP - nv[0].mSoSP));
        }
    }
}

