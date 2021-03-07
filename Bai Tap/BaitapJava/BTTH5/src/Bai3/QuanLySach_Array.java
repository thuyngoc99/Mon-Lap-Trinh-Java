package De1;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

public class QuanLySach_Array {
    TaiLieu[] taiLieus;

    public void nhapTaiLieu(){
        System.out.println("Nhap so tai lieu: ");
        Scanner nhap = new Scanner(System.in);
        int n = nhap.nextInt();
        taiLieus = new TaiLieu[n];
        for (int i = 0; i < n; i++) {
            System.out.println("1. Sach ; 2.Tap chi ; 3.Bao");
            System.out.println("Nhap lua chon: ");
            int x = nhap.nextInt();
            if (x == 1){
                System.out.println("Sach thu " + (i+1));
                taiLieus[i] = new Sach();
            }
            else if (x == 2){
                System.out.println("Tap chi thu " + (i+1));
                taiLieus[i] = new TapChi();
            }
            else if (x == 3){
                System.out.println("Bao thu " + (i+1));
                taiLieus[i] = new Bao();
            }
            taiLieus[i].nhap();
        }
    }

    public void hienTaiLieu(){
        for (int i = 0; i < taiLieus.length; i++) {
            System.out.println(taiLieus[i].toString());
        }
    }

    public TaiLieu[] getTaiLieus(){
        return taiLieus;
    }

    public void timKiemTheoLoai(String loai){
        for (TaiLieu taiLieu: taiLieus) {
            if (taiLieu instanceof Sach && taiLieu.getClass().getSimpleName().equalsIgnoreCase(loai)){
                System.out.println(taiLieu.toString());
            }
            else if (taiLieu instanceof TapChi && taiLieu.getClass().getSimpleName().equalsIgnoreCase(loai)){
                System.out.println(taiLieu.toString());
            }
            else if (taiLieu instanceof Bao && taiLieu.getClass().getSimpleName().equalsIgnoreCase(loai)){
                System.out.println(taiLieu.toString());
            }
        }
    }

    public void sort(){
        ArrayList<TaiLieu> tl = new ArrayList<>(Arrays.asList(taiLieus));
        Collections.sort(tl, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getMaTaiLieu().compareTo(o2.getMaTaiLieu());
            }
        });
        for (int i = 0; i < tl.size(); i++) {
            System.out.println(tl.get(i).toString());
        }
    }

    public static void main(String[] args) {
        QuanLySach_Array array = new QuanLySach_Array();
        array.nhapTaiLieu();
        array.hienTaiLieu();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap loai can tim: ");
        String loai = nhap.nextLine();
        array.timKiemTheoLoai(loai);
        System.out.println("Sap xep: ");
        array.sort();
    }
}
