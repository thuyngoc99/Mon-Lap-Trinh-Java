package De1;

import java.util.*;

public class QuanLySach_Hashtable {
    private Hashtable<String, TaiLieu> taiLieu;
    Scanner nhap = new Scanner(System.in);

    public QuanLySach_Hashtable() {
        taiLieu = new Hashtable<>();
    }

    public void nhapTaiLieu(){
        System.out.println("Nhap so tai lieu: ");
        int n = nhap.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap lua chon: 1. Sach; 2. Tap chi; 3.Bao");
            int x = nhap.nextInt();
            if (x == 1){
                TaiLieu sach = new Sach();
                sach.nhap();
                taiLieu.put(sach.getMaTaiLieu(), sach);
            }
            else if(x == 2){
                TaiLieu tapchi = new TapChi();
                tapchi.nhap();
                taiLieu.put(tapchi.getMaTaiLieu(), tapchi);
            }
            else if(x == 3){
                TaiLieu bao = new Bao();
                bao.nhap();
                taiLieu.put(bao.getMaTaiLieu(), bao);
            }
        }
    }

    public void hienTaiLieu(){
        Enumeration<TaiLieu> en = taiLieu.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }

    public Hashtable<String, TaiLieu> getTaiLieu(){
        return taiLieu;
    }

    public Hashtable<String, TaiLieu> timKiemTheoLoai(String loai){
        Hashtable<String, TaiLieu> tl = new Hashtable<>();
        Enumeration<TaiLieu> en = taiLieu.elements();
        while (en.hasMoreElements()){
            TaiLieu taiLieu = en.nextElement();
            if (taiLieu instanceof Sach && taiLieu.getClass().getSimpleName().equalsIgnoreCase(loai)){
                tl.put(taiLieu.getMaTaiLieu(), taiLieu);
            }
            else if (taiLieu instanceof TapChi && taiLieu.getClass().getSimpleName().equalsIgnoreCase(loai)){
                tl.put(taiLieu.getMaTaiLieu(), taiLieu);
            }
            else if (taiLieu instanceof Bao && taiLieu.getClass().getSimpleName().equalsIgnoreCase(loai)){
                tl.put(taiLieu.getMaTaiLieu(), taiLieu);
            }
        }
        return tl;
    }

    public void sort(){
        ArrayList<TaiLieu> tl = new ArrayList<>(taiLieu.values());
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
        Scanner nhap = new Scanner(System.in);
        QuanLySach_Hashtable hashtable = new QuanLySach_Hashtable();
        hashtable.nhapTaiLieu();
        hashtable.hienTaiLieu();
        System.out.println("Nhap loai can tim: ");
        String loai = nhap.nextLine();
        if (hashtable.timKiemTheoLoai(loai).isEmpty()){
            System.out.println("Khong tim thay loai nay");
        }
        else {
            Enumeration<TaiLieu> en = hashtable.timKiemTheoLoai(loai).elements();
            while (en.hasMoreElements()){
                System.out.println(en.nextElement().toString());
            }
        }
        System.out.println("Sap xep: ");
        hashtable.sort();
    }
}
