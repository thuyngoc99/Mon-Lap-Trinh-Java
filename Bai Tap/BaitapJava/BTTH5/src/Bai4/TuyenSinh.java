package Bai4;

import Bai3.Bao;
import Bai3.Sach;
import Bai3.TaiLieu;
import Bai3.TapChi;

import java.util.Scanner;

public class TuyenSinh {
    ThiSinhkhoiA[] thiSinh;
    int n;
    public void nhap(){
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap so luong thi sinh: ");
        n = Integer.parseInt(nhapDL.nextLine());
        thiSinh = new ThiSinhkhoiA[n];
        for (int i = 0; i < thiSinh.length; i++)
        {
            System.out.println("Chon thi sinh (a - Khoi A, b - Khoi B, c - Khoi C) : ");
            String chon = nhapDL.nextLine();
            switch (chon)
            {
                case "a":
                    thiSinh[i] = new ThiSinhkhoiA("Toan", "Ly", "Hoa");
                    break;

                case "b":
                    thiSinh[i] = new ThiSinhkhoiB("Toan", "Hoa", "Sinh");
                    break;

                case "c":
                    thiSinh[i] = new ThiSinhkhoiC("Van", "Su", "Dia");
                    break;
            }
            thiSinh[i].nhapmon();
        }
    }

    public void display() {
        for (int i = 0; i < thiSinh.length; i++) {
            System.out.print("Thi sinh thu " + (i + 1) + " : ");
            System.out.println(thiSinh[i].toString());
        }
    }

    public String timkiem() {
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap so bao danh can tim kiem: ");
        int soBaoDanh = new Scanner(System.in).nextInt();
        for (int i = 0; i < thiSinh.length; i++) {
            if (thiSinh[i].getSoBaoDanh() == soBaoDanh) {
                return thiSinh[i].toString();
            }
        }
        return "Khong tim thay.";
    }

    public static void main(String[] args) {
        Scanner nhapDL = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();
        while (true) {

            System.out.println("1. Nhap thong tin ve cac thi sinh du thi");
            System.out.println("2. Hien thi thong tin ve mot thi sinh");
            System.out.println("3. Tim kiem thong tin thi sinh");
            System.out.println("4. Thoat");

            System.out.println("Nhap lua chon: ");
            int choose = nhapDL.nextInt();

            switch (choose) {
                case 1: {
                    tuyenSinh.nhap();
                    break;
                }

                case 2: {
                    tuyenSinh.display();
                    break;
                }

                case 3: {
                    System.out.println(tuyenSinh.timkiem());
                    break;
                }

                case 4:
                {
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Sai lua chon");
                    break;
                }
            }
        }
    }
}

