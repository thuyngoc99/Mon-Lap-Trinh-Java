package Bai1;

import java.util.*;

public class StudentManager {
    Hashtable<String, Student> students;

    public StudentManager() {
        students = new Hashtable<>();
    }
    Student student = new Student();
    public void enterStudents(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int soluong = nhap.nextInt();
        for (int i = 0; i < soluong; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1));
            Student student = new Student();
            student.nhap();
            students.put(student.getId(), student);
        }
    }

    public void printList(){
        Enumeration<String> en = students.keys();
        while (en.hasMoreElements()){
            System.out.println(students.get(en.nextElement()));
        }
    }

    public void sortByScoreDesc(){
        ArrayList<Student> student = new ArrayList<>(students.values());
        Collections.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getScore() > s2.getScore()){
                    return -1;
                }
                else if (s1.getScore() < s2.getScore()){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i).toString());
        }
    }

    public Hashtable<String, Student> findStudentByScore(float score){
        Hashtable<String, Student> listStudent = new Hashtable<>();
        Enumeration<Student> en = students.elements();
        while (en.hasMoreElements()){
            Student student = en.nextElement();
            if (student.getScore() == score){
                listStudent.put(student.getId(), student);
            }
        }
        return listStudent;
    }

}
