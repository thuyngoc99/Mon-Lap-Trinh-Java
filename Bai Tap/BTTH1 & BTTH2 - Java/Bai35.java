package BaiTap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Bai35 {
    public static void main(String[] args) {
        String ngaySinh;
        String ten;
        Scanner nhapdl = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten = nhapdl.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = nhapdl.nextLine();
        SimpleDateFormat birthday = new SimpleDateFormat("dd/mm/yyyy");
        Date a;
        try {
            a = birthday.parse(ngaySinh);
            Calendar lich = Calendar.getInstance();
            lich.setTime(a);
            System.out.println("Age: " + (Calendar.getInstance().get(Calendar.YEAR) - lich.get(Calendar.YEAR)));
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }
}


