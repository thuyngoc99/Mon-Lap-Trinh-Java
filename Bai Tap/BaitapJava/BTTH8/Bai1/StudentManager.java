package Bai1;

import java.util.*;

public class StudentManager {

    Vector<Student> students;

    public StudentManager() {
        students = new Vector<>();
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
        Enumeration<Student> en = students.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
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

    public Vector<Student> findStudentByScore(float score) {
        Vector<Student> dsStudents = new Vector<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getScore() == score) {
                dsStudents.add(students.get(i));
            }
        }
        return dsStudents;
    }
}
