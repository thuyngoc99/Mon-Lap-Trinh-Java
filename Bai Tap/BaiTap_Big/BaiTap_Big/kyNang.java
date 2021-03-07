package BaiTap_Big;

import java.util.Scanner;

public class kyNang {
    private String tenKyNang;
    private float satThuong;
    private String thuocTinh;
    private String moTa;

    public kyNang(){

    }

    public kyNang(String tenKyNang, float satThuong, String thuocTinh, String moTa){
        this.tenKyNang = tenKyNang;
        this.satThuong = satThuong;
        this.thuocTinh = thuocTinh;
        this.moTa = moTa;
    }

    public String getTenKyNang() {
        return tenKyNang;
    }

    public void setTenKyNang(String tenKyNang) {
        this.tenKyNang = tenKyNang;
    }

    public float getSatThuong() {
        return satThuong;
    }

    public void setSatThuong(float satThuong) {
        this.satThuong = satThuong;
    }

    public String getThuocTinh() {
        return thuocTinh;
    }

    public void setThuocTinh(String thuocTinh) {
        this.thuocTinh = thuocTinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void nhapdl(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ky nang: ");
        tenKyNang = nhap.nextLine();
        System.out.println("Nhap sat thuong: ");
        satThuong = Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap thuoc tinh: ");
        thuocTinh = nhap.nextLine();
        System.out.println("Nhap mo ta: ");
        moTa = nhap.nextLine();
    }

    @Override
    public String toString() {
        return "{ Ten ky nang: " + tenKyNang + " , Sat thuong: " + satThuong
                + " , Thuoc tinh: " + thuocTinh + " , Mo ta: " + moTa + " }";
    }

}
