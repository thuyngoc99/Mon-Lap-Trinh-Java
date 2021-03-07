package BaiTap_Big;

import java.util.Scanner;

public class VoDang extends MonPhai implements BoHanhVi{

    private String doAN;
    private String thoiGian;
    private String diaDiem;
    private String vuKhi;

    public VoDang() {
    }

    public VoDang(String tenKyNang, float satThuong, String thuocTinh, String moTa, String tenMonPhai, String tenTruongMon, String noiO, String monQuy, String moTa1, String doAN, String thoiGian, String diaDiem, String vuKhi) {
        super(tenKyNang, satThuong, thuocTinh, moTa, tenMonPhai, tenTruongMon, noiO, monQuy, moTa1);
        this.doAN = doAN;
        this.thoiGian = thoiGian;
        this.diaDiem = diaDiem;
        this.vuKhi = vuKhi;
    }

    @Override
    public void nhapdl() {
        super.nhapdl();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap do an: ");
        doAN = nhap.nextLine();
        System.out.println("Nhap vu khi: ");
        vuKhi = nhap.nextLine();
        System.out.println("Nhap thoi gian: ");
        thoiGian = nhap.nextLine();
        System.out.println("Nhap dia diem: ");
        diaDiem = nhap.nextLine();
    }

    public void GiangDao(){
        System.out.println("Vo dang dang giang dao");
    }

    @Override
    public void luyenCong() {
        System.out.println("Vo dang dang luyen " + kyNang + " bang vu khi " + vuKhi);
    }

    @Override
    public void anUong() {
        System.out.println("Vo dang dang an do an " + doAN + " voi thoi gian " + thoiGian + " o dia diem " + diaDiem);
    }

    @Override
    public String toString() {
        return super.toString() + " doAN: " + doAN + ", thoiGian: " + thoiGian + ", diaDiem: " + diaDiem + ", vuKhi: " + vuKhi;
    }
}
