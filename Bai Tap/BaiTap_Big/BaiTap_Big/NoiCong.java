package BaiTap_Big;

public class NoiCong extends kyNang {

    public NoiCong() {
    }

    public NoiCong(String tenKyNang, float satThuong, String thuocTinh, String moTa) {
        super(tenKyNang, satThuong, thuocTinh, moTa);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void vanCong(){
        System.out.println("Van cong");
    }
}