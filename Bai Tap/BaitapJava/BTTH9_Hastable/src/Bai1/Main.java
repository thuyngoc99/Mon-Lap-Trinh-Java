package Bai1;

import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("====================  Enter student ====================== ");
        studentManager.enterStudents();
        System.out.println("==================== Print student ==========================");
        studentManager.printList();
        System.out.println("==================== Sort by score ==========================");
        studentManager.sortByScoreDesc();

        System.out.println("==================== Find by score ===========================");
        System.out.println("Enter score to find: ");
        float score = nhapDL.nextFloat();
        if (studentManager.findStudentByScore(score).isEmpty()){
            System.out.println("No find student");
        }
        else {
            Enumeration<Student> en = studentManager.findStudentByScore(score).elements();
            while (en.hasMoreElements()){
                System.out.println(en.nextElement());
            }
        }
    }
}
