package Bai3;

import java.util.Scanner;

public class QuanLySach {

    TaiLieu[] taiLieus;
    int n;

    public void nhap(){
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap so tai lieu: ");
        n = Integer.parseInt(nhapDL.nextLine());
        taiLieus = new TaiLieu[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Chon tai lieu (a - sach, b - tai lieu, c - bao) : ");
            String chon = nhapDL.nextLine();
            switch (chon)
            {
                case "a":
                    taiLieus[i] = new Sach();
                    break;

                case "b":
                    taiLieus[i] = new Bao();
                    break;

                case "c":
                    taiLieus[i] = new TapChi();
                    break;
            }
            taiLieus[i].nhap();
        }
    }

    public void hien(){
        for(int i = 0; i < taiLieus.length; i++) {
            System.out.println(taiLieus[i].toString());
        }

    }

    public void timKiemTheoLoai(){
        System.out.println("Chon loai tai lieu can tim kiem: (Sach; Bao; Tap chi) ");
        Scanner nhapDl = new Scanner(System.in);
        String loai = nhapDl.nextLine();
        for (TaiLieu taiLieu : taiLieus){
            if (taiLieu.loai().equalsIgnoreCase(loai))
                System.out.println(taiLieu.toString());
        }
    }

    public static void main(String[] args) {
        Scanner nhapDL = new Scanner(System.in);
        QuanLySach quanLySach = new QuanLySach();

        while (true)
        {
            System.out.println("============== MENU ==================");
            System.out.println("1. Nhap thong tin ve cac tai lieu ");
            System.out.println("2. Hien thong tin ve cac tai lieu ");
            System.out.println("3. Tim kiem tai lieu theo loai ");
            System.out.println("4. Thoat ");
            System.out.println("Nhap lua chon: ");
            int choose = nhapDL.nextInt();
            switch (choose)
            {
                case 1:
                {
                    quanLySach.nhap();
                    break;
                }

                case 2:
                {
                    quanLySach.hien();
                    break;
                }

                case 3:
                {
                    quanLySach.timKiemTheoLoai();
                    break;
                }

                case 4:
                {
                    System.exit(0);
                    break;
                }

                default: {
                    System.out.println("Sai lua chon");
                    break;
                }
            }
        }
    }
}


