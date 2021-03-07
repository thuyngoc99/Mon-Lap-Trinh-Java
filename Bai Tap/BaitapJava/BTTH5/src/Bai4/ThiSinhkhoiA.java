package Bai4;

import java.util.Scanner;

public class ThiSinhkhoiA extends ThiSinh {
    private String mon1, mon2, mon3;

    public ThiSinhkhoiA(){

    }
    public ThiSinhkhoiA(String mon1, String mon2, String mon3) {
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public ThiSinhkhoiA(int soBaoDanh, String hoTen, String diaChi, String uuTien, String mon1, String mon2, String mon3) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public String getMon1() {
        return mon1;
    }

    public void setMon1(String mon1) {
        this.mon1 = mon1;
    }

    public String getMon2() {
        return mon2;
    }

    public void setMon2(String mon2) {
        this.mon2 = mon2;
    }

    public String getMon3() {
        return mon3;
    }

    public void setMon3(String mon3) {
        this.mon3 = mon3;
    }

    public void nhapmon(){
        super.nhap();
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap mon 1: ");
        mon1 = nhapDL.nextLine();
        System.out.println("Nhap mon 2: ");
        mon2 = nhapDL.nextLine();
        System.out.println("Nhap mon 3: ");
        mon3 = nhapDL.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + mon1 + " - " + mon2 + " - " + mon3 + " }";
    }

}
