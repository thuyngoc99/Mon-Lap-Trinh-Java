package BaiTap;

import java.util.Scanner;

public class Bai34 {
    public static void main(String[] args) {
        float diemToan, diemLy, diemHoa;
        float diemTB = 0;
        long maHocSinh;
        String tenHocSinh, xepLoai;
        Scanner nhapdl = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh: ");
        tenHocSinh = nhapdl.nextLine();
        System.out.println("Nhap ma hoc sinh: ");
        maHocSinh = nhapdl.nextLong();
        System.out.println("Nhap diem toan: ");
        diemToan = nhapdl.nextFloat();
        System.out.println("Nhap diem ly: ");
        diemLy = nhapdl.nextFloat();
        System.out.println("Nhap diem hoa: ");
        diemHoa = nhapdl.nextFloat();

        if ((diemToan < 0 && diemLy < 0 && diemHoa < 0) || (diemToan > 10 && diemLy > 10 && diemHoa > 10)) {
            System.out.println("Khong hop le.");
        } else {
            diemTB = (diemToan + diemLy + diemHoa) / 3;
            System.out.println("Diem trung binh: " + diemTB);
            if (diemTB >= 9) {
                xepLoai = "Xuất sắc";
                System.out.println("Xeploai: " + xepLoai);
            }
            else if ((diemTB > 7) && (diemTB < 9)) {
                xepLoai = "Giỏi";
                System.out.println("Xeploai: " + xepLoai);
            }
            else if ((diemTB > 6) && (diemTB < 8)) {
                xepLoai = "Khá";
                System.out.println("Xeploai: " + xepLoai);
            }
            else if ((diemTB > 5) && (diemTB < 7)) {
                xepLoai = "Trung bình";
                System.out.println("Xeploai: " + xepLoai);
            }
            else if ((diemTB > 3.5) && (diemTB < 5)) {
                xepLoai = "Yếu";
                System.out.println("Xeploai: " + xepLoai);
            }
            else {
                xepLoai = "Kém";
                System.out.println("Xeploai: " + xepLoai);
            }
        }
    }
}
