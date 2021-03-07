package Bai7;

import java.util.Scanner;

public class StudentBody {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            students[i] = new Student();
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            students[i].nhapsinhvien();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(students[i].toString());
        }
    }
}
