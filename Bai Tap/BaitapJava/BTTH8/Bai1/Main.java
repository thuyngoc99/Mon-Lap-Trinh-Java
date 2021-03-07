package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.nhapStudent();
        System.out.println("=========== Danh sach sinh vien ===========");
        studentManager.printList();

        System.out.println("\n=========== Sinh vien sau khi sap xep =========== ");
        studentManager.sortByScoreDesc();
        studentManager.printList();

        Scanner nhap = new Scanner(System.in);
        System.out.println("\nNhap diem can tim: ");
        float score = nhap.nextFloat();
        if (studentManager.findStudentByScore(score).isEmpty()){
            System.out.println("Khong tim thay sinh vien co diem so nay");
        }
        else {
            for (int i = 0; i < studentManager.findStudentByScore(score).size(); i++){
                studentManager.findStudentByScore(score).get(i).hien();
            }
        }
    }
}
