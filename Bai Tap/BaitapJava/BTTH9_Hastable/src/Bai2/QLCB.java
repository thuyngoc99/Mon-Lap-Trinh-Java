package Bai2;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class QLCB {
    Hashtable<String, CanBo> canbo;

    public QLCB() {
        canbo = new Hashtable<>();
    }

    public void nhapCanBo(){
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap so luong can bo: ");
        int sl = nhapDL.nextInt();
        for (int i = 0; i < sl; i++){
            System.out.println("Nhap can bo thu " + (i + 1));
            System.out.println("Lua chon: 1. Cong nhan, 2. Ky su, 3. Nhan vien");
            int choose = nhapDL.nextInt();
            if (choose == 1){
                CanBo congNhan = new CongNhan();
                congNhan.nhap();
                canbo.put(congNhan.getId(), congNhan);
            }
            else if (choose == 2){
                CanBo kySu = new KySu();
                kySu.nhap();
                canbo.put(kySu.getId(), kySu);
            }
            else if (choose == 3){
                CanBo nhanVien = new NhanVien();
                nhanVien.nhap();
                canbo.put(nhanVien.getId(), nhanVien);
            }
            else {
                System.out.println("Lua chon sai");
                break;
            }
        }
    }

    public void hienCanBo(){
        Enumeration<String> en = canbo.keys();
        while (en.hasMoreElements()){
            System.out.println(canbo.get(en.nextElement()));
        }
    }

    public Hashtable<String, CanBo> getCanbo(){
        return canbo;
    }

    public Hashtable<String, CanBo> timKiemTheoId(String id){
        Hashtable<String, CanBo> danhSachCanBo = new Hashtable<>();
        Enumeration<CanBo> en = canbo.elements();
        while (en.hasMoreElements()){
            CanBo cb = en.nextElement();
            if (cb.getId().contains(id)){
                danhSachCanBo.put(cb.getId(), cb);
            }
        }
        return danhSachCanBo;
    }
}
