package Bai2;

import java.util.Scanner;

public class QuanLyCanBo {
    CanBo[] canBos;
    int n;

    public void nhap() {
        Scanner nhapDl = new Scanner(System.in);
        System.out.println("Nhap so can bo: ");
        n = Integer.parseInt(nhapDl.nextLine());
        canBos = new CanBo[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Chon can bo (a - cong nhan, b - ky su, c - nhan vien): ");
            String canbo = nhapDl.nextLine();
            switch (canbo) {
                case "a": {
                    canBos[i] = new CongNhan();
                    break;
                }
                case "b": {
                    canBos[i] = new KySu();
                    break;
                }
                case "c": {
                    canBos[i] = new NhanVien();
                    break;
                }
            }
            canBos[i].nhap();
        }
    }
    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.println(canBos[i].toString());
        }
    }


    public void timkiem() {
        System.out.println("Nhap ten can tim kiem: ");
        Scanner nhapDl = new Scanner(System.in);
        String ten = nhapDl.nextLine();
        for (int i = 0; i < n; i++) {
            if (canBos[i].getHoTen().equals(ten)) {
                System.out.println(canBos[i].toString());
            }
        }
    }

    public static void main(String[] args) {

        Scanner nhapDl = new Scanner(System.in);
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        while (true) {
            System.out.println("============== MENU ==================");
            System.out.println("1. Nhap thong tin can bo ");
            System.out.println("2. Hien thi thong tin can bo ");
            System.out.println("3. Tim kiem thong tin can bo ");
            System.out.println("4. Thoat ");
            System.out.println("Nhap choose: ");
            int choose = nhapDl.nextInt();
            switch (choose) {
                case 1: {
                    quanLyCanBo.nhap();
                    break;
                }

                case 2: {
                    quanLyCanBo.display();
                    break;
                }

                case 3: {
                    quanLyCanBo.timkiem();

                    break;
                }

                case 4: {
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

