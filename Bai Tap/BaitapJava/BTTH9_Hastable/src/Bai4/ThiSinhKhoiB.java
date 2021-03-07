package Bai4;

public class ThiSinhKhoiB extends ThiSinh {

    private static final String tenMon1 = "Toan";
    private static final String tenMon2 = "Hoa";
    private static final String tenMon3 = "Sinh";

    public ThiSinhKhoiB() {
    }

    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
    }

    @Override
    public void nhap() {
        super.nhap();
    }

    @Override
    public void hien() {
        super.hien();
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB {" + super.toString() + "Mon: " + tenMon1 + ", " + tenMon2 + ", " + tenMon3 + "}";
    }
}
