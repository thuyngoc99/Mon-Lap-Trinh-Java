package BaiTap_Big;

import java.util.Scanner;

public class QuanLy {
    public static void main(String[] args) {

        ThieuLam thieuLam = new ThieuLam();
        CaiBang caiBang = new CaiBang();
        VoDang voDang = new VoDang();

        Scanner nhap = new Scanner(System.in);

        System.out.println("Nhap thong tin thieu lam");
        thieuLam.nhapdl();
        System.out.println("Nhap thong tin cai bang");
        caiBang.nhapdl();
        System.out.println("Nhap thong tin vo dang");
        voDang.nhapdl();

        System.out.println("---------------------------------");

        System.out.println("Thong tin thieu lam");
        System.out.println(thieuLam.toString());

        System.out.println("---------------------");
        System.out.println("Thong tin cai bang");
        System.out.println(caiBang.toString());

        System.out.println("---------------------");
        System.out.println("Thong tin vo dang");
        System.out.println(voDang.toString());

        System.out.println("---------------------------------");
        System.out.println("Cac phuong thuc cua thieu lam");

        thieuLam.TungKinh();
        thieuLam.luyenCong();
        thieuLam.anUong();

        System.out.println("---------------------------------");
        System.out.println("Cac phuong thuc cua cai bang");
        caiBang.AnXin();
        caiBang.luyenCong();
        caiBang.anUong();

        System.out.println("---------------------------------");
        System.out.println("Cac phuong thuc cua vo dang");
        voDang.GiangDao();
        voDang.luyenCong();
        voDang.anUong();

        System.out.println("---------------------------------");
        System.out.println("So sanh giua cac mon phai");
        thieuLam.compare_cacMonPhai(caiBang);
        thieuLam.compare_cacMonPhai(voDang);
        voDang.compare_cacMonPhai(caiBang);

    }
}
