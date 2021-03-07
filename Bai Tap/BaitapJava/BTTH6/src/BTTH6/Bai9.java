package BTTH6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai9 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so dien thoai theo dinh dang (091) 022-6758080: ");
        String xau = nhap.nextLine();

        String maQuocGia = xau.substring(0, xau.lastIndexOf(")") + 1);
        String maVung = xau.substring(xau.lastIndexOf(" ") + 1, xau.lastIndexOf("-"));
        String soDienThoai = xau.substring(xau.lastIndexOf("-") + 1);

        System.out.println("Ma quoc gia: " + maQuocGia + " ,ma vung: " + maVung + " ,so dien thoai: " + soDienThoai);
    }
}
