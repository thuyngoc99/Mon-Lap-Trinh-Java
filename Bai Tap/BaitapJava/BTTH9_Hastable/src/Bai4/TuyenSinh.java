package Bai4;

import java.util.*;

public class TuyenSinh {

    Hashtable<String, ThiSinh> thiSinhs;

    public TuyenSinh() {
        thiSinhs = new Hashtable<>();
    }

    public void nhapThiSinh(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so thi sinh: ");
        int soThiSinh = nhap.nextInt();
        for (int i = 0; i < soThiSinh; i++) {
            System.out.println("Thi sinh thu " + (i + 1));
            System.out.println("Nhap lua chon: 1 - ThiSinhKhoiA, 2 - ThiSinhKhoiB, 3 - ThiSinhKhoiC");
            int choose = nhap.nextInt();
            do {
                switch (choose){
                    case 1:
                        System.out.println("=========== Thi Sinh Khoi A ===========");
                        ThiSinhKhoiA thiSinhKhoiA = new ThiSinhKhoiA();
                        thiSinhKhoiA.nhap();
                        thiSinhs.put(thiSinhKhoiA.getSoBaoDanh(), thiSinhKhoiA);
                        break;
                    case 2:
                        System.out.println("=========== Thi Sinh Khoi B ===========");
                        ThiSinhKhoiB thiSinhKhoiB = new ThiSinhKhoiB();
                        thiSinhKhoiB.nhap();
                        thiSinhs.put(thiSinhKhoiB.getSoBaoDanh(), thiSinhKhoiB);
                        break;
                    case 3:
                        System.out.println("=========== Thi Sinh Khoi C ===========");
                        ThiSinhKhoiC thiSinhKhoiC = new ThiSinhKhoiC();
                        thiSinhKhoiC.nhap();
                        thiSinhs.put(thiSinhKhoiC.getSoBaoDanh(), thiSinhKhoiC);
                        break;
                    default:
                        System.out.println("Lua chon khong dung");
                        break;
                }
            }
            while (choose < 1 || choose > 4);
        }
    }

    public void hienThiSinh(){
        Enumeration<String> en = thiSinhs.keys();
        while (en.hasMoreElements()){
            System.out.println(thiSinhs.get(en.nextElement()));
        }
    }

    public Hashtable<String , ThiSinh> getThiSinhs(){
        return thiSinhs;
    }

    public Hashtable<String, ThiSinh> timKiem(String soBaoDanh){
        Hashtable<String, ThiSinh> danhSachThiSinh = new Hashtable<>();
        Enumeration<ThiSinh> ts = thiSinhs.elements();
        while (ts.hasMoreElements()){
            ThiSinh thiSinh = ts.nextElement();
            if (thiSinh.getSoBaoDanh().contains(soBaoDanh)){
                danhSachThiSinh.put(thiSinh.getSoBaoDanh(), thiSinh);
            }
        }
        return danhSachThiSinh;
    }
}

