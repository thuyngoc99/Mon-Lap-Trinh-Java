package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    ArrayList<ThiSinh> thiSinhs = new ArrayList<>();

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
                        thiSinhs.add(thiSinhKhoiA);
                        break;
                    case 2:
                        System.out.println("=========== Thi Sinh Khoi B ===========");
                        ThiSinhKhoiB thiSinhKhoiB = new ThiSinhKhoiB();
                        thiSinhKhoiB.nhap();
                        thiSinhs.add(thiSinhKhoiB);
                        break;
                    case 3:
                        System.out.println("=========== Thi Sinh Khoi C ===========");
                        ThiSinhKhoiC thiSinhKhoiC = new ThiSinhKhoiC();
                        thiSinhKhoiC.nhap();
                        thiSinhs.add(thiSinhKhoiC);
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
        for (ThiSinh thisinh : thiSinhs) {
            System.out.println(thisinh.toString());
        }
    }

    public ArrayList<ThiSinh> timKiem(String soBaoDanh){
        ArrayList<ThiSinh> dsThiSinh = new ArrayList<>();
        for (ThiSinh thisinh : thiSinhs) {
            if (thisinh.getSoBaoDanh().contains(soBaoDanh)){
                dsThiSinh.add(thisinh);
            }
        }
        return dsThiSinh;
    }
}
