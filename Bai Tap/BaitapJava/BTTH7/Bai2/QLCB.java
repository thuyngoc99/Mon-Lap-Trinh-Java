package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    ArrayList<CanBo> canBos = new ArrayList<>();

    public void nhapCanBo() {
        Scanner nhap = new Scanner(System.in);
        int choose;
        System.out.println("Nhap so can bo: ");
        int soCanBo = nhap.nextInt();
        for (int i = 0; i < soCanBo; i++) {
            System.out.println("Can bo thu " + (i + 1));
            do {
                System.out.println("Nhap lua chon: 1 - Cong nhan, 2 - Ky su, 3 - Nhan vien");
                choose = nhap.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("======= CONG NHAN ========");
                        CongNhan congNhan = new CongNhan();
                        congNhan.nhap();
                        canBos.add(congNhan);
                        break;
                    case 2:
                        System.out.println("======= KY SU ========");
                        KySu kySu = new KySu();
                        kySu.nhap();
                        canBos.add(kySu);
                        break;
                    case 3:
                        System.out.println("======= NHAN VIEN ========");
                        NhanVien nhanVien = new NhanVien();
                        nhanVien.nhap();
                        canBos.add(nhanVien);
                        break;
                    default:
                        System.out.println("Lua chon khong dung");
                        break;
                }
            }
            while (choose < 1 || choose > 3);
        }
    }

    public void hienCanBo(){
        for (CanBo canbo : canBos) {
            System.out.println(canbo.toString());
        }
    }

    public ArrayList<CanBo> timKiem(String hoTen){
        ArrayList<CanBo> dsCanBo = new ArrayList<>();
        for (CanBo canbo : canBos) {
            if (canbo.getHoTen().contains(hoTen)){
                dsCanBo.add(canbo);
            }
        }
        return dsCanBo;
    }


}
