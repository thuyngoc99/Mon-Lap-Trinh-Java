package Bai2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    private Lecturer[] lecturerList;
    private Student[] studentList;
    private ManagerFile managerFile;
    private Person[] people;
//    public MainApp(int n) {
//        lecturerList = new Lecturer[n];
//        studentList = new Student[n];
//    }

    public void initLecturers(){
        System.out.println("Nhap so luong bai giang: ");
        int slLecture = new Scanner(System.in).nextInt();
        lecturerList = new Lecturer[slLecture];
        for (int i = 0; i < lecturerList.length; i++) {
            System.out.println("Nhap lecture thu " + (i + 1));
            lecturerList[i] = new Lecturer();
            lecturerList[i].inputData();
        }
    }

    public void initStudents (){
        System.out.println("Nhap so luong sinh vien: ");
        int slStudent = new Scanner(System.in).nextInt();
        studentList = new Student[slStudent];
        for (int i = 0; i < studentList.length; i++) {
            System.out.println("Nhap student thu " + (i + 1));
            studentList[i] = new Student();
            studentList[i].inputData();
        }
    }

    public Student[] getStudentList(){
        return studentList;
    }

    public  Lecturer[] getLecturerList(){
        return lecturerList;
    }

    public void displayLecturers(){
        for (int i = 0; i < lecturerList.length; i++) {
            System.out.println(lecturerList[i].toString());
        }
    }

    public void displayStudents(){
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].toString());
        }
    }

    public Student searchStudentByName(){
        System.out.println("Nhap ten can tim: ");
        String ten = new Scanner(System.in).nextLine();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null && studentList[i].name.equalsIgnoreCase(ten)){
                return studentList[i];
            }
        }
        return null;
    }

    public Student searchMaxGrade(){
        Student max = studentList[0];
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null && studentList[i].getGrade() > max.getGrade()){
                max = studentList[i];
            }
        }
        return max;
    }

    public void writeFileStudent() throws IOException {
        managerFile = new ManagerFile();
        for (int i = 0; i < studentList.length; i++) {
            managerFile.writeFileLecturer(studentList[i].toString());
        }
    }

    public void readFileStudent() throws IOException {
        managerFile = new ManagerFile();
        ArrayList<Student> students = new ArrayList<>();
        String line;
        while ((line = managerFile.readFileStudent()) != null){
            String[] st = line.split("\t");
            String name = st[0];
            String add = st[1];
            String studentId = st[2];
            String lecId = st[3];
            String topicTitle = st[4];
            float grade = Float.parseFloat(st[5]);
            Student sv = new Student(name, add, studentId, lecId, topicTitle, grade);
            students.add(sv);
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }

    public void writeFileLecture() throws IOException {
        managerFile = new ManagerFile();
        for (int i = 0; i < lecturerList.length; i++) {
            managerFile.writeFileLecturer(lecturerList[i].toString());
        }
    }

    public void readFileLecture() throws IOException {
        managerFile = new ManagerFile();
        ArrayList<Lecturer> lecturer = new ArrayList<>();
        String line;
        while ((line = managerFile.readFileLecturer()) != null){
            String[] lect = line.split("\t");
            String name = lect[0];
            String add = lect[1];
            String lecid = lect[2];
            Lecturer baihoc = new Lecturer(name, add, lecid);
            lecturer.add(baihoc);
        }
        for (int i = 0; i < lecturer.size(); i++) {
            System.out.println(lecturer.get(i).toString());
        }
    }

    public static void main(String[] args) throws IOException {
//        System.out.println("Nhap so luong: ");
//        int n = new Scanner(System.in).nextInt();
        MainApp app = new MainApp();
//        System.out.println("============ NHAP LECTURE ========================");
//        app.initLecturers();
//        System.out.println("============ NHAP STUDENT ========================");
//        app.initStudents();
////        System.out.println("============ HIEN THI LECTURE ========================");
////        app.displayLecturers();
//        System.out.println("============ HIEN THI STUDENT ========================");
//        app.displayStudents();
//        System.out.println("============ TIM KIEM THEO TEN STUDENT ========================");
//        System.out.println(app.searchStudentByName());
//        System.out.println("============ TIM KIEM STUDENT CO DIEM CAO NHAT ========================");
//        System.out.println(app.searchMaxGrade());
//        System.out.println("============ GHI FILE STUDENT ========================");
        //app.writeFileStudent();
//        System.out.println("============ DOC FILE STUDENT ========================");
        //app.readFileStudent();
//        System.out.println("============ GHI FILE LECTURE ========================");
//        app.writeFileLecture();
//        System.out.println("============ DOC FILE STUDENT ========================");
//        app.readFileStudent();
//        System.out.println("============ DOC FILE LECTURE ========================");
//        app.readFileLecture();

    }
}
