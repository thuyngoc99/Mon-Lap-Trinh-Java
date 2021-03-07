package Bai2;

import java.util.*;

public class Array {
    private Student[] students;
    private Lecturer[] lecturers;

    public void initSV(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so sinh vien: ");
        int n = nhap.nextInt();
        students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("SV thu " + (i+1));
            students[i] = new Student();
            students[i].inputData();
        }
    }

    public void initCB(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so can bo: ");
        int n = nhap.nextInt();
        lecturers = new Lecturer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("CB thu " +(i+1));
            lecturers[i] = new Lecturer();
            lecturers[i].inputData();
        }
    }

    public void displaySV(){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }

    public void displayCB(){
        for (int i = 0; i < lecturers.length; i++) {
            System.out.println(lecturers[i].toString());
        }
    }

    public void timKiemSVTheoTen(String name){
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(name)){
                System.out.println(students[i].toString());
            }
        }

    }

    public void sortByScore(){
        ArrayList<Student> sv = new ArrayList(Arrays.asList(students));
        Collections.sort(sv, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGrade() > o2.getGrade()){
                    return 1;
                }
                else  if (o1.getGrade() < o2.getGrade()){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        for (int i = 0; i < sv.size() ; i++) {
            System.out.println(sv.get(i).toString());
        }
    }

//    public ArrayList<Student> SearchMax(){
//        ArrayList<Student> sinhvien = new ArrayList<>();
//        Student max = students[0];
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].getGrade() >= max.getGrade()){
//                max = students[i];
//            }
//        }
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].getGrade() == max.getGrade()){
//                sinhvien.add(students[i]);
//            }
//        }
//        return sinhvien;
//    }

    public Student[] SearchMax(){
        Student[] dssv = new Student[students.length];
        Student max = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGrade() >= max.getGrade()){
                max = students[i];
            }
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGrade() == max.getGrade()){
                dssv[i] = students[i];
            }
        }
        return dssv;
    }

    public static void main(String[] args) {
        Array mang = new Array();
        mang.initSV();
        mang.displaySV();
        System.out.println("Nhap ten can tim: ");
        String name = new Scanner(System.in).nextLine();

        mang.timKiemSVTheoTen(name);
//        mang.sortByScore();
        System.out.println(mang.SearchMax());
    }
}
