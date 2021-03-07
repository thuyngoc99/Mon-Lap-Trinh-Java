package Bai4;

import java.util.Scanner;

public class ThiSinhKhoiA extends ThiSinh {
    private static final String tenMon1 = "Toan";
    private static final String tenMon2 = "Ly";
    private static final String tenMon3 = "Hoa";

    public ThiSinhKhoiA() {
    }

    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
    }

    @Override
    public void hien() {
        super.hien();
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiA {" + super.toString() + "Mon: " + tenMon1 + ", " + tenMon2 + ", " + tenMon3 + "}";
    }
}
