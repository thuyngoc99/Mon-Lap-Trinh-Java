package Bai3;

import java.util.*;

public class QuanLySach {

    Hashtable<String, TaiLieu> taiLieus;

    public QuanLySach() {
        taiLieus = new Hashtable<>();
    }

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
                        taiLieus.put(sach.getMaTaiLieu(), sach);
                        break;
                    case 2:
                        System.out.println("============= TAP CHI ================");
                        TapChi tapChi = new TapChi();
                        tapChi.nhap();
                        taiLieus.put(tapChi.getMaTaiLieu(), tapChi);
                        break;
                    case 3:
                        System.out.println("============= BAO ================");
                        Bao bao = new Bao();
                        bao.nhap();
                        taiLieus.put(bao.getMaTaiLieu(), bao);
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
        Enumeration<String> en = taiLieus.keys();
        while (en.hasMoreElements()){
            System.out.println(taiLieus.get(en.nextElement()));
        }
    }

    public ArrayList<TaiLieu> timkiem(String loaiTaiLieu){
        ArrayList<TaiLieu> dsTaiLieu = new ArrayList<>();
        Enumeration<TaiLieu> tl = taiLieus.elements();
        while (tl.hasMoreElements()){
            TaiLieu taiLieu = tl.nextElement();
            if (taiLieu.loaiTaiLieu().contains(loaiTaiLieu)){
                dsTaiLieu.add(taiLieu);
            }
        }
        return dsTaiLieu;
    }
}


