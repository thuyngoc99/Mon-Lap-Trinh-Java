package BaiTap_Big;

public class NgoaiCong extends kyNang {

    public NgoaiCong(){
    }

    public NgoaiCong(String tenKyNang, float satThuong, String thuocTinh, String moTa) {
        super(tenKyNang, satThuong, thuocTinh, moTa);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void danhLienHoan(){
        System.out.println("Danh lien hoan");
    }
}
