package TTCS;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner nhapDL = new Scanner(System.in);
        QuanLy quanLy = new QuanLy();
        ManagerDatabase md = new ManagerDatabase();

        while (true){
            System.out.println("1. Nhap ung vien");
            System.out.println("2. In ung vien");
            System.out.println("3. Tim kiem ung vien");
            System.out.println("4. Sap xep ung vien");
            System.out.println("5. Xoa ung vien");
            System.out.println("6. Sua ung vien");
//            System.out.println("7. Luu thong tin ung vien vao file");
            System.out.println("8. Doc thong tin ung vien tu file ra man hinh");
            System.out.println("9. Kiem tra thong tin ung vien trong file roi ghi vao CSDL");
            System.out.println("===========================================");
            System.out.println("Nhap lua chon: ");
            int x = nhapDL.nextInt();

            switch (x){
                case 1:
                {
                    quanLy.nhap();
                    break;
                }
                case 2:
                {
                    quanLy.hien();
                    break;
                }
                case 3:
                {
                    System.out.println("Nhap ten ung vien can tim: ");
                    String ten = new Scanner(System.in).nextLine();
                    if (quanLy.timKiemTheoTenUngVien(ten).isEmpty()){
                        System.out.println("Khong tim thay ung vien");
                    }
                    else {
                        for (int i = 0; i < quanLy.timKiemTheoTenUngVien(ten).size(); i++) {
                            System.out.println(quanLy.timKiemTheoTenUngVien(ten).get(i).toString());
                        }
                    }
                    break;
                }
                case 4:
                {
                    quanLy.sapXepTheoTen();
                    break;
                }
                case 5:
                {
                    quanLy.xoaUngVien();
                    break;
                }
                case 6:
                {
                    quanLy.suaUngVien();
                    break;
                }
//                case 7:
//                {
//                    quanLy.writelistUngVienToFile();
//                    break;
//                }
                case 8:{
                    quanLy.readListUngVien();
                    break;
                }
                case 9:
                {
                    new MainApp().main();
                    break;
                }

            }
        }
    }
}
