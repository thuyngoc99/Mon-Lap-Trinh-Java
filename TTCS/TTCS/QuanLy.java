package TTCS;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class QuanLy implements Serializable {
    ArrayList<UngVien> ungViens = new ArrayList<>();
    ManagerFile mf;

    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        while (true){
            Scanner nhapDL = new Scanner(System.in);
            System.out.println("Nhap loai ung vien: 1 - UngVienCoKinhNghiem, 2 - UngVienMoiTotNghiep, 3 - SinhVienThucTap");
            int loaiUV = nhapDL.nextInt();
            if (loaiUV == 1){
                UngVien ungVienCoKinhNghiem = new UngVien_CoKinhNghiem();
                ungVienCoKinhNghiem.nhapUngVien();
                ungViens.add(ungVienCoKinhNghiem);
            }
            else if (loaiUV == 2){
                UngVien ungVienMoiTotNghiep = new UngVien_MoiTotNghiep();
                ungVienMoiTotNghiep.nhapUngVien();
                ungViens.add(ungVienMoiTotNghiep);
            }

            else if (loaiUV == 3){
                UngVien sinhVienThucTap = new SinhVienThucTap();
                sinhVienThucTap.nhapUngVien();
                ungViens.add(sinhVienThucTap);
            }

            System.out.println("Ban co nhap tiep (Yes/ No): ");
            if (nhap.nextLine().equalsIgnoreCase("No")){
                break;
            }
        }
    }

    public ArrayList<UngVien> getList(){
        return ungViens;
    }

    public void hien(){
        for (int i = 0; i < ungViens.size(); i++){
            System.out.println(ungViens.get(i).toString());
        }
        System.out.println();
    }

    public ArrayList<UngVien> timKiemTheoTenUngVien(String ten){
        ArrayList<UngVien> listTenUngVien = new ArrayList<>();
        for (int i = 0; i < ungViens.size(); i++){
            if (ungViens.get(i).getHoTen().contains(ten)){
                listTenUngVien.add(ungViens.get(i));
            }
        }
        return listTenUngVien;
    }

    public ArrayList<UngVien> sapXepTheoTen(){
        Collections.sort(ungViens, new Comparator<UngVien>() {
            @Override
            public int compare(UngVien o1, UngVien o2) {
                return (o1.getHoTen().compareTo(o2.getHoTen()));
            }
        });
        for (int i = 0; i < ungViens.size(); i++) {
            System.out.println(ungViens.get(i).toString());
        }
        return ungViens;
    }

    public void xoaUngVien(){
        int count = 0;
        System.out.println("Nhap ten ung vien can xoa: ");
        String tenUngVien = new Scanner(System.in).nextLine();
        for (int i = 0; i < ungViens.size(); i++) {
            if (ungViens.get(i).getHoTen().equalsIgnoreCase(tenUngVien))
                ungViens.remove(i);
                count++;
        }
        if (count == 0){
            System.out.println("Khong xoa duoc ung vien");
        }
        System.out.println("Danh sach cac ung vien sau khi xoa: ");
        for (int i = 0; i < ungViens.size(); i++){
            System.out.println(ungViens.get(i).toString());
        }
    }

    public ArrayList<UngVien> suaUngVien(){
        int count = 0;
        ArrayList<UngVien> listUV = new ArrayList<>();
        System.out.println("Nhap ten ung vien can sua: ");
        String ten = new Scanner(System.in).nextLine();
        for (UngVien ungVien : ungViens){
            if (ungVien.getHoTen().equalsIgnoreCase(ten)){
                ungVien.nhapUngVien();
                listUV.add(ungVien);
                count++;
            }
        }
        if (count == 0){
            System.out.println("Khong tim thay ung vien co " + ten + " nay.");
        }
        for (int i = 0; i < listUV.size(); i++){
            System.out.println(listUV.get(i).toString());
        }
        return listUV;
    }

    public void writelistUngVienToFile() throws IOException {
        mf = new ManagerFile();
        for (int i = 0; i < ungViens.size(); i++) {
            if (ungViens.get(i).getClass().getSimpleName().contains("UngVien_CoKinhNghiem")){
                mf.writeFile1("1, " + ungViens.get(i).toString() + "\n");
            }
            else if (ungViens.get(i).getClass().getSimpleName().contains("UngVien_MoiTotNghiep")){
                mf.writeFile1("2, " + ungViens.get(i).toString() + "\n");
            }
            else if (ungViens.get(i).getClass().getSimpleName().contains("SinhVienThucTap")) {
                mf.writeFile1("3, " + ungViens.get(i).toString() + "\n");
            }
        }
    }

    private static final String NONE = "none";
    public void readListUngVien() throws IOException {
        mf = new ManagerFile();
        ArrayList<UngVien> listUngVien = new ArrayList<>();
        String line;
        System.out.println("Chon ung vien can doc: 1 - UngVienCoKinhNghiem, 2 - UngVienMoiTotNghiep, 3 - SinhVienThucTap");
        int x = new Scanner(System.in).nextInt();
        while ((line = mf.readFilee()) != null) {
            String[] uv = line.split(",");
            String hoTen = uv[1];
            String ngayThangNamSinh = uv[2];
            String diaChi = uv[3];
            String queQuan = uv[4];
            String soDienThoai = uv[5];
            String email = uv[6];

            if (x == 1) {
                if (Integer.parseInt(uv[0]) == 1) {
                    float soNamKinhNghiem = Float.parseFloat((uv[7]));
                    String kyNangChuyenMon = uv[8];
                    String noiLamViecGanNhat = uv[9];
                    UngVien uvCoKinhNghiem = new UngVien_CoKinhNghiem(hoTen, ngayThangNamSinh, diaChi, queQuan, soDienThoai,
                            email, soNamKinhNghiem, kyNangChuyenMon, noiLamViecGanNhat);
                    listUngVien.add(uvCoKinhNghiem);
                }
            } else if (x == 2) {
                if (Integer.parseInt(uv[0]) == 2) {
                    String thoiDiemTotNghiep = uv[10];
                    String xepLoaiTotNghiep = uv[11];
                    String truongTotNghiep = uv[12];
                    UngVien uvMoiTotNghiep = new UngVien_MoiTotNghiep(hoTen, ngayThangNamSinh, diaChi, queQuan, soDienThoai, email,
                            thoiDiemTotNghiep, xepLoaiTotNghiep, truongTotNghiep);
                    listUngVien.add(uvMoiTotNghiep);
                }
            } else if (x == 3) {
                if (Integer.parseInt(uv[0]) == 3) {
                    String chuyenNganhDangHoc = uv[13];
                    int hocKyDangHoc = Integer.parseInt((uv[14]));
                    String tenTruongDangHoc = uv[15];
                    String ngayDuKienTotNghiep = uv[16];
                    UngVien sinhVienThucTap = new SinhVienThucTap(hoTen, ngayThangNamSinh, diaChi, queQuan, soDienThoai, email,
                            chuyenNganhDangHoc, hocKyDangHoc, tenTruongDangHoc, ngayDuKienTotNghiep);
                    listUngVien.add(sinhVienThucTap);
                }
            }
        }

            for (int i = 0; i < listUngVien.size(); i++) {
                System.out.println(listUngVien.get(i).toString());
            }

    }
}
