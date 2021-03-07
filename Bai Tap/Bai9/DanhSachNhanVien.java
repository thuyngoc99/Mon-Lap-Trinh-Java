package Bai9;

import java.util.Scanner;

public class DanhSachNhanVien {

    NhanVien[] nhanViens;

    public DanhSachNhanVien(int n) {
        nhanViens = new NhanVien[n];
    }

    public void AddNhanVien() {
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println("Nhan vien thu " + (i + 1));
            nhanViens[i] = new NhanVien();
            nhanViens[i].nhap();
        }
    }

    public void DisplayNhanVien() {
        NhanVien.XuatTieuDe();
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i] != null) {
                System.out.println(nhanViens[i].toString());
            }

        }
    }

    public int sumNhanVien(){
        int sum = 0;
        for(int i = 0; i < nhanViens.length; i++){
            sum ++;
        }
        return sum;
    }

    public void getNhanVienCoSoSanPhamVuotChuan(){
        System.out.println("Thong tin cua cac nhan vien co so san pham vuot chuan: ");
        for (int i = 0; i < nhanViens.length; i++){
            if(nhanViens[i].coVuotChuan()){
                System.out.println(nhanViens[i].toString());
            }
        }
    }

    public int countNhanVienCoSoSanPhamKhongVuotChuan(){
        int count = 0;
        for(int i = 0; i < nhanViens.length; i++){
            if (!(nhanViens[i].coVuotChuan())){
                count++;
            }
        }
        return count;
    }

    public int sumLuongNhanVienCoVuotChuan(){
        int sum = 0;
        for (int i = 0; i < nhanViens.length; i++){
            if(nhanViens[i].coVuotChuan()) {
                sum += nhanViens[i].getLuong();
            }
        }
        return sum;
    }

    public NhanVien getNhanVienCoSoSanPhamMin(){
        NhanVien min = nhanViens[0];
        for (int i = 0; i < nhanViens.length; i++){
            if(nhanViens[i].getSoSP() < min.getSoSP()) {
                min = nhanViens[i];
            }
        }
        return min;
    }

    public NhanVien getNhanVienLuongMax(){
        NhanVien max = nhanViens[0];
        for (int i = 0; i < nhanViens.length; i++){
            if(nhanViens[i].getLuong() > max.getLuong()){
                max = nhanViens[i];
            }
        }
        return max;
    }

    public NhanVien getNhanVienKhongVuotChuanLuongMax() {
        NhanVien max = nhanViens[0];
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i].coVuotChuan()) {

            } else {
                if (nhanViens[i].getLuong() > max.getLuong()) {
                    max = nhanViens[i];
                }
            }
        }
        return max;
    }

    public int sumLuong(){
        int sum = 0;
        for (int i = 0; i < nhanViens.length; i++){
            sum += nhanViens[i].getLuong();
        }
        return sum;
    }

    public NhanVien timKiem(){
        String maNV;
        int x = 1;
        Scanner nhapDl = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can tim kiem: ");
        maNV = nhapDl.nextLine();
        for (int i = 0; i < nhanViens.length; i++){
            if(nhanViens[i].getMaNV().equals(maNV)){
                return nhanViens[i];
            }
        }
        return null;
    }

    public void sapxep() {
        NhanVien temp;
        for (int i = 0; i < nhanViens.length - 1; i++) {
            for (int j = i + 1; j < nhanViens.length; j++) {
                if (nhanViens[i].getSoSP() > nhanViens[j].getSoSP()) {
                    temp = nhanViens[i];
                    nhanViens[i] = nhanViens[j];
                    nhanViens[j] = temp;
                }
            }
        }
    }

    public void xoaNhanVien(){
        String maNV;
        Scanner nhapDl = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can xoa: ");
        maNV = nhapDl.nextLine();
        for(int i = 0; i < nhanViens.length; i++){
            if(nhanViens[i].getMaNV().equals(maNV)){
                nhanViens[i] = null;
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = nhapDL.nextInt();
        DanhSachNhanVien danhSachNhanVien = new DanhSachNhanVien(n);

        //them nhan vien
        danhSachNhanVien.AddNhanVien();

        //hien thi thong tin nhan vien
        danhSachNhanVien.DisplayNhanVien();

        System.out.println("Tong so nhan vien: " + danhSachNhanVien.sumNhanVien());

        //thong tin cac nhan vien co so san pham vuot chuan
        danhSachNhanVien.getNhanVienCoSoSanPhamVuotChuan();

        System.out.println("So nhan vien co so san pham khong vuot chuan: " + danhSachNhanVien.countNhanVienCoSoSanPhamKhongVuotChuan());

        System.out.println("Tong luong cua cac nhan vien vuot chuan: " + danhSachNhanVien.sumLuongNhanVienCoVuotChuan());

        System.out.println("Nhan vien co so san pham it nhat: " + danhSachNhanVien.getNhanVienCoSoSanPhamMin());

        System.out.println("Nhan vien co luong cao nhat: " + danhSachNhanVien.getNhanVienLuongMax());

        System.out.println("Nhan vien khong vuot chuan co luong cao nhat: " + danhSachNhanVien.getNhanVienKhongVuotChuanLuongMax());

        System.out.println("Tong luong cua tat ca nhan vien: " + danhSachNhanVien.sumLuong());

        //tim kiem nhan vien
        System.out.println(danhSachNhanVien.timKiem());

        //sap xep nhan vien tang dan theo so san pham
        danhSachNhanVien.sapxep();
        System.out.println("Danh sach nhan vien sau khi sap xep: ");
        danhSachNhanVien.DisplayNhanVien();

        //xoa nhan vien
        danhSachNhanVien.xoaNhanVien();
        System.out.println("Danh sach nhan vien sau khi xoa: ");
        danhSachNhanVien.DisplayNhanVien();

    }

}
