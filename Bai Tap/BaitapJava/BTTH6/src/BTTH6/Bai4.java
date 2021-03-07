package BTTH6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Nhap duong dan cua mot tap tin co dang: /home/user/filename.php ");
        String path = new Scanner(System.in).nextLine();

        String ten = path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("."));
        String phanMoRong = path.substring(path.lastIndexOf(".") + 1);
        String duongDan = path.substring(0 , path.lastIndexOf("/") + 1);

        System.out.println("Ten file: " + ten + " ,phan mo rong: " + phanMoRong + " ,duong dan: " + duongDan);
    }
}
