package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    ArrayList<TaiLieu> taiLieus = new ArrayList<>();

    public void nhapTaiLieu(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so tai lieu: ");
        int soTaiLieu = nhap.nextInt();
        for (int i = 0; i < soTaiLieu; i++){
            System.out.println("Nhap lua chon: 1 - Sach, 2 - Tap chi, 3 - Bao");
            int choose = nhap.nextInt();
            do {
                switch (choose){
                    case 1:
                        System.out.println("============= SACH ================");
                        Sach sach = new Sach();
                        sach.nhap();
                        taiLieus.add(sach);
                        break;
                    case 2:
                        System.out.println("============= TAP CHI ================");
                        TapChi tapChi = new TapChi();
                        tapChi.nhap();
                        taiLieus.add(tapChi);
                        break;
                    case 3:
                        System.out.println("============= BAO ================");
                        Bao bao = new Bao();
                        bao.nhap();
                        taiLieus.add(bao);
                        break;
                    default:
                        System.out.println("Lua chon khong dung");
                        break;
                }
            }
            while (choose < 1 || choose > 3);
        }
    }

    public void hienTaiLieu(){
        for (TaiLieu tailieu : taiLieus) {
            System.out.println(tailieu.toString());
        }
    }

    public ArrayList<TaiLieu> timkiem(String loaiTaiLieu){
        ArrayList<TaiLieu> dsTaiLieu = new ArrayList<>();
        for (TaiLieu tailieu : taiLieus) {
            if (tailieu.loaiTaiLieu().contains(loaiTaiLieu)){
                dsTaiLieu.add(tailieu);
            }
        }
        return dsTaiLieu;
    }
}
