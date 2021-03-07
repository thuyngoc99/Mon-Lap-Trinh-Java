package Bai4;

public class ThiSinhKhoiC extends ThiSinh {

    private static final String tenMon1 = "Van";
    private static final String tenMon2 = "Su";
    private static final String tenMon3 = "Dia";

    public ThiSinhKhoiC() {
    }

    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
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
        return "ThiSinhKhoiC {" + super.toString() + "Mon: " + tenMon1 + ", " + tenMon2 + ", " + tenMon3 + '}';
    }
}
