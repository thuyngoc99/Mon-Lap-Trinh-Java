package BT2;

import java.util.Scanner;

public class StudentBody {

    public static void main(String[] args) {
        Student[] sinhvien = new Student[3];
        for (int i = 0; i < 3; i++) {
            sinhvien[i] = new Student();
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            sinhvien[i].nhapSV();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(sinhvien[i].toString());
        }
    }
}

