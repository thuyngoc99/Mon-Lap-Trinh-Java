package Bai2;

import java.util.Scanner;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String hoTen, String namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner nhapDl = new Scanner(System.in);
        System.out.println("Nhap nganh dao tao: ");
        nganhDaoTao = nhapDl.nextLine();
    }

    @Override
    public String toString() {
        return "Ky su " + super.toString() + nganhDaoTao;
    }
}

