package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {

    ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void nhapStudent() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int soSV = nhap.nextInt();
        for (int i = 0 ; i < soSV; i++){
            System.out.println("Sinh vien thu " + (i + 1));
            Student student = new Student();
            student.nhap();
            students.add(student);
        }
    }

    public void printList() {
        for (Student student : students) {
            student.hien();
        }
    }

    public void sortByScoreDesc() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getScore() > s2.getScore()) {
                    return -1;
                } else if (s1.getScore() < s2.getScore()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public ArrayList<Student> findStudentByScore(float score) {
        ArrayList<Student> dsStudents = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getScore() == score) {
                dsStudents.add(students.get(i));
            }
        }
        return dsStudents;
    }
}
