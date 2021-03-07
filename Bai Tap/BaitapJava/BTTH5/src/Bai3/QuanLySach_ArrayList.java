package De1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySach_ArrayList {
    private ArrayList<TaiLieu> taiLieus;
    Scanner nhap = new Scanner(System.in);

    public QuanLySach_ArrayList(){
        taiLieus = new ArrayList<>();
    }

    public void nhapTaiLieu(){
        System.out.println("Nhap so tai lieu:");
        int n = nhap.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap lua chon: 1. Sach ; 2.Tap chi ; 3.Bao");
            int x = nhap.nextInt();
            if (x == 1){
                TaiLieu sach = new Sach();
                sach.nhap();
                taiLieus.add(sach);
            }
            else if (x == 2){
                TaiLieu tapchi = new TapChi();
                tapchi.nhap();
                taiLieus.add(tapchi);
            }
            else if (x == 3){
                TaiLieu bao = new Bao();
                bao.nhap();
                taiLieus.add(bao);
            }
        }
    }

    public void hienTaiLieu(){
        for (int i = 0; i < taiLieus.size(); i++) {
            System.out.println(taiLieus.get(i).toString());
        }
    }

    public ArrayList<TaiLieu> timKiemTheoLoai(String loai){
        ArrayList<TaiLieu> tl = new ArrayList<>();
        for (TaiLieu taiLieu : taiLieus){
            if (taiLieu instanceof Sach && taiLieu.getClass().getSimpleName().equalsIgnoreCase(loai)){
                tl.add(taiLieu);
            }
            else if (taiLieu instanceof TapChi && taiLieu.getClass().getSimpleName().equalsIgnoreCase(loai)){
                tl.add(taiLieu);
            }
            else if (taiLieu instanceof Bao && taiLieu.getClass().getSimpleName().equalsIgnoreCase(loai)){
                tl.add(taiLieu);
            }
        }
        return tl;
    }

    public void sort(){
        Collections.sort(taiLieus, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getMaTaiLieu().compareTo(o2.getMaTaiLieu());
            }
        });
        for (int i = 0; i < taiLieus.size(); i++) {
            System.out.println(taiLieus.get(i).toString());
        }
    }

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        QuanLySach_ArrayList arrayList = new QuanLySach_ArrayList();
        arrayList.nhapTaiLieu();
        arrayList.hienTaiLieu();
        System.out.println("Nhap loai can tim:");
        String loai = nhap.nextLine();
        if (arrayList.timKiemTheoLoai(loai).isEmpty()){
            System.out.println("Khong tim thay loai nay");
        }
        else {
            for (int i = 0; i < arrayList.timKiemTheoLoai(loai).size(); i++) {
                System.out.println(arrayList.timKiemTheoLoai(loai).get(i).toString());
            }
        }
        System.out.println("Sap xep");
        arrayList.sort();
    }
}
