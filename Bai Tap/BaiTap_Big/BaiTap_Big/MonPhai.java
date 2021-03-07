package BaiTap_Big;

import java.util.Scanner;

public class MonPhai extends kyNang {
    private String tenMonPhai;
    private String tenTruongMon;
    private String noiO;
    private String monQuy;
    private String moTa;
    public kyNang kyNang;

    public MonPhai() {
    }

    public MonPhai(String tenKyNang, float satThuong, String thuocTinh, String moTa, String tenMonPhai, String tenTruongMon, String noiO, String monQuy, String moTa1) {
        super(tenKyNang, satThuong, thuocTinh, moTa);
        this.tenMonPhai = tenMonPhai;
        this.tenTruongMon = tenTruongMon;
        this.noiO = noiO;
        this.monQuy = monQuy;
        this.moTa = moTa1;
    }

    public String getTenMonPhai() {
        return tenMonPhai;
    }

    public void setTenMonPhai(String tenMonPhai) {
        this.tenMonPhai = tenMonPhai;
    }

    public String getTenTruongMon() {
        return tenTruongMon;
    }

    public void setTenTruongMon(String tenTruongMon) {
        this.tenTruongMon = tenTruongMon;
    }

    public String getNoiO() {
        return noiO;
    }

    public void setNoiO(String noiO) {
        this.noiO = noiO;
    }

    public String getMonQuy() {
        return monQuy;
    }

    public void setMonQuy(String monQuy) {
        this.monQuy = monQuy;
    }

    @Override
    public String getMoTa() {
        return moTa;
    }

    @Override
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public void nhapdl() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ten mon phai: ");
        tenMonPhai = nhap.nextLine();
        System.out.println("Nhap ten truong mon: ");
        tenTruongMon = nhap.nextLine();
        System.out.println("Nhap noi o: ");
        noiO = nhap.nextLine();
        System.out.println("Nhap mon quy: ");
        monQuy = nhap.nextLine();
        System.out.println("Nhap mo ta: ");
        moTa = nhap.nextLine();
        System.out.println("Nhap lua chon: 1 - Noi cong, 2 - Ngoai cong");
        int choose = nhap.nextInt();
        if (choose == 1){
            kyNang = new NoiCong();
            kyNang.nhapdl();
        }
        else {
            kyNang = new NgoaiCong();
            kyNang.nhapdl();
        }
    }

    public void compare_cacMonPhai(MonPhai tenMonPhai1) {
        System.out.println("Mon phai " + getTenMonPhai() + " so tai voi mon phai " + tenMonPhai1.getTenMonPhai());
        if (this.kyNang.getSatThuong() > tenMonPhai1.kyNang.getSatThuong()){
            System.out.println("Mon phai " + this.tenMonPhai + " chien thang.");
        }
        else if (kyNang.getSatThuong() < tenMonPhai1.kyNang.getSatThuong()){
            System.out.println("Mon phai " + tenMonPhai1.getTenMonPhai() + " chien thang.");
        }
        else {
            System.out.println("Mon phai " + this.tenMonPhai + " hoa " + tenMonPhai1.tenMonPhai);
        }
    }

    @Override
    public String toString() {
        return "tenMonPhai: " + tenMonPhai + ", tenTruongMon: " + tenTruongMon +
                ", noiO: " + noiO + ", monQuy: " + monQuy + ", moTa: " + moTa + ", kyNang: " + kyNang + ",";
    }
}
