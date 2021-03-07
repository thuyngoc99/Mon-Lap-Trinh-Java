package BaitapJava_Buoi3;

import java.util.Scanner;

public class NhanVien {
    private String maNV;
    private int soSP;

    public NhanVien(){
        soSP = 0;
    }
    public NhanVien(String ma, int sp){
        if(sp < 0){
            sp = 0;
            return;
        }
        maNV = ma;
        soSP = sp;
    }

    public String getMaNV(){
        return maNV;
    }

    public void setMaNV(String ma){
        maNV = ma;
    }

    public int getSoSP(){
        return soSP;
    }

    public void setSoSP(int sp){
        if(sp < 0){
            sp = 0;
            return;
        }
        soSP = sp;
    }

    public boolean coVuotChuan(){
        if(soSP > 500){
            return true;
        }
        else{
            return false;
        }
    }

    public String getTongKet(){
        String dem = "";
        if(coVuotChuan()) dem = "vuot";
        return dem;
    }

    public double getLuong(){
        if (coVuotChuan()) {
            return 30000 * (double)this.soSP;
        } else {
            return 2000 * soSP;
        }
    }
    public static void XuatTieuDe(){
        System.out.println("Ma nhan vien | So san pham | Luong  | Tong ket ");
    }

    @Override
    public String toString(){
        return maNV + "\t \t \t \t" + soSP + "\t \t \t" + getLuong() + "\t" + getTongKet();
    }

    public static void main(String[] args) {

        NhanVien[] nv = new NhanVien[2];

        String maNV;
        int soSP;

        for (int i = 0; i < 2; i++) {
            Scanner nhapDL = new Scanner(System.in);
            nv[i]  = new NhanVien();
            System.out.println("Nhap ma nhan vien thu " + (i + 1));
            maNV = nhapDL.nextLine();
            System.out.println("Nhap so san pham thu " + (i + 1));
            soSP = nhapDL.nextInt();
            nv[i].setMaNV(maNV);
            nv[i].setSoSP(soSP);
        }
        NhanVien.XuatTieuDe();
        System.out.println(nv[0].toString());
        System.out.println(nv[1].toString());

    }

}
