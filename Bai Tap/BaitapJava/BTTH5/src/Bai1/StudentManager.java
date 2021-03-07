package Bai1;

import java.util.Scanner;

public class StudentManager {
    Student[] students;

    public StudentManager() {
        students = new Student[5];
        for (int i = 0; i < students.length; i++){
            students[0] = new Student(2, "anh", 9);
            students[1] = new Student(3, "hoa", 7);
            students[2] = new Student(4, "thai", 8);
            students[3] = new Student(5, "van", 6);
            students[4] = new Student(6, "uyen", 8);
        }
    }

    public void printList(){
        for (int i = 0 ; i < students.length; i++){
            System.out.print("Sinh vien thu " + (i + 1) + " : ");
            System.out.println(students[i].toString());
        }
    }

    public void sortByScoreDecs(){
        for (int i = 0; i < students.length - 1; i++){
            for(int j = i + 1; j < students.length; j++){
                if(students[i].getScore() < students[j].getScore()){
                    Student tempt = students[i];
                    students[i] = students[j];
                    students[j] = tempt;
                }
            }
        }
    }

    public Student findStudentByScore(int score){
        for (int i = 0; i < students.length; i++){
            if(students[i].getScore() == score){
                return students[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int score;
        Scanner nhapDl = new Scanner(System.in);

        StudentManager studentManager = new StudentManager();
        studentManager.printList();
        //sap xep
        studentManager.sortByScoreDecs();
        System.out.println("\nSinh vien sau khi sap xep: ");
        studentManager.printList();

        System.out.println("Nhap diem: ");
        score = nhapDl.nextInt();
        System.out.println("Sinh vien co diem trung voi tham so dau vao: ");
        System.out.println(studentManager.findStudentByScore(score));
    }


}
