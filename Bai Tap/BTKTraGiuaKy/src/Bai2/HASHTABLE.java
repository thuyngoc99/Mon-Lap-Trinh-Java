package Bai2;

import java.io.IOException;
import java.util.*;

public class HASHTABLE {
    private Hashtable<String, Lecturer> canBo;
    private Hashtable<String, Student> sinhVien;

    private ManagerFile file;
    Scanner nhap = new Scanner(System.in);
    public HASHTABLE(){
        canBo = new Hashtable<>();
        sinhVien = new Hashtable<>();
    }

    public void initLecture(){
        System.out.println("Nhap so can bo: ");
        int n = nhap.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Can bo thu " + (i + 1));
            Lecturer lecturer = new Lecturer();
            lecturer.inputData();
            canBo.put(lecturer.getLecId(), lecturer);
        }
    }

    public void initStudent(){
        System.out.println("Nhap so sinh vien: ");
        int n = nhap.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1));
            Student sv = new Student();
            sv.inputData();
            sinhVien.put(sv.getStudentId(), sv);
            //students.add(sv);
        }
    }

    public void displayLecture(){
        Enumeration<Lecturer> lect = canBo.elements();
        while (lect.hasMoreElements()){
            System.out.println(lect.nextElement());
        }
    }

    public void displayStudent(){
        Enumeration<Student> student = sinhVien.elements();
        while (student.hasMoreElements()){
            System.out.println(student.nextElement());
        }
//        for (int i = 0; i < students.size(); i++) {
//            System.out.println(students.get(i).toString());
//        }
    }

    public ArrayList<Student> searchStudentByName(String name){
        ArrayList<Student> dssv = new ArrayList<>();
        Enumeration<Student> sv = sinhVien.elements();
        while (sv.hasMoreElements()){
            Student student = sv.nextElement();
            if (student.name.contains(name)){
                dssv.add(student);
            }
        }
        return  dssv;
    }

    public Hashtable<String, Student> timkiemsv(String name) {
        Hashtable<String, Student> sv = new Hashtable<>();
        Enumeration<Student> en = sinhVien.elements();
        while (en.hasMoreElements()){
            Student student = en.nextElement();
            if (student.name.contains(name)){
                sv.put(student.getStudentId(), student);
            }
        }
        return sv;
    }


    public ArrayList<Student> searchTen(String name){
        ArrayList<Student> dssv = new ArrayList<>();
        Enumeration<Student> en = sinhVien.elements();
        while (en.hasMoreElements()){
            Student student = en.nextElement();
            if (student.name.contains(name)){
                dssv.add(student);
            }
        }
        return dssv;
    }



    public void searchStudentGradeMax() {
        ArrayList<Student> sv = new ArrayList<>(sinhVien.values());
        Student max = sv.get(0);
        for (int i = 0; i < sv.size(); i++) {
            if (sv.get(i).getGrade() > max.getGrade()){
                max = sv.get(i);
            }
        }
        System.out.println(max);
    }

    public void docFile() throws IOException {
        file = new ManagerFile();
        ArrayList<Student> dssv = new ArrayList<>();
        String line;
        while ((line = file.readFileStudent()) != null){
            String[] lt = line.split("\t");
            String ten = lt[0];
            String diachi = lt[1];
            String masv = lt[2];
            String magv = lt[3];
            String chude = lt[4];
            float diem = Float.parseFloat(lt[5]);
            Student sv = new Student(ten, diachi, masv, magv, chude, diem);
            dssv.add(sv);
        }
        for (int i = 0; i < dssv.size(); i++) {
            System.out.println(dssv.get(i).toString());
        }
    }

    public void ghiFile() throws IOException {
        file = new ManagerFile();
        Enumeration<Student> st = sinhVien.elements();
        while (st.hasMoreElements()){
            file.writeStudent(st.nextElement().toString());
        }
    }

    public static void main(String[] args) throws IOException {
        HASHTABLE main = new HASHTABLE();
//        main.initLecture();
//        main.displayLecture();
        main.initStudent();
        main.displayStudent();
        System.out.println("Nhap ten can tim: ");
        String name = new Scanner(System.in).nextLine();
        if (main.searchTen(name).isEmpty()){
            System.out.println("Khong tim thay");
        }
        else {
            for (int i = 0; i < main.searchTen(name).size(); i++) {
                System.out.println(main.searchTen(name).get(i).toString());
            }
        }

        System.out.println("======================");
        main.searchStudentGradeMax();
//        main.ghiFile();
//        main.docFile();
    }
}
