package Bai3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Faculty extends University {
    private String facultyId;
    private String facultyName;
    private Lecturer[] lecturerList;
    private FileManager fileManager;

    public  Faculty(){}
    public Faculty(int n) {
        lecturerList = new Lecturer[n];
    }

    public Faculty(String uniName, String uniAddress, String facultyId, String facultyName) {
        super(uniName, uniAddress);
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void initFaculty(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap facultyId:");
        facultyId = nhap.nextLine();
        System.out.println("Nhap facultyName: ");
        facultyName = nhap.nextLine();
        super.inputData();
        System.out.println("Nhap so can bo: ");
        int n = nhap.nextInt();
        lecturerList = new Lecturer[n];
        for (int i = 0; i < lecturerList.length; i++) {
            System.out.println("Can bo thu " + (i + 1));
            lecturerList[i] = new Lecturer();
            lecturerList[i].inputData();
        }
    }

    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so can bo: ");
        int n = nhap.nextInt();
        lecturerList = new Lecturer[n];
        for (int i = 0; i < lecturerList.length; i++) {
            System.out.println("Can bo thu " + (i + 1));
            lecturerList[i] = new Lecturer();
            lecturerList[i].inputData();
        }
    }

    public void display(){
        super.toString();
        for (int i = 0; i < lecturerList.length; i++) {
            System.out.print(facultyId + "\t" + facultyName + "\t");
            System.out.print(uniName + "\t" + uniAddress + "\t");
            System.out.println(lecturerList[i].toString());
        }
    }

    public Lecturer[] getLecturerList() {
        return lecturerList;
    }

    public void searchByName(){
        System.out.println("Nhap ten can bo can tim: ");
        String ten = new Scanner(System.in).nextLine();
        for (int i = 0; i < lecturerList.length; i++) {
            if (lecturerList[i] != null && lecturerList[i].getLecName().equalsIgnoreCase(ten)){
                System.out.println(lecturerList[i].toString());
            }
        }
    }

    public void writeFileListLecture() throws IOException {
        fileManager = new FileManager();
        for (int i = 0; i < lecturerList.length; i++) {
            fileManager.writeFile(lecturerList[i].toString());
        }
    }

    public void readFileListLecture() throws IOException {
        fileManager = new FileManager();
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        String line = "";
        while ((line = fileManager.readFile()) != null){
            String[] lect = line.split("\t");
            String lecId = lect[0];
            String lecName = lect[1];
            String lecAddress = lect[2];
            Lecturer giangVien = new Lecturer(lecId, lecName, lecAddress);
            lecturers.add(giangVien);
        }
        for (int i = 0; i < lecturers.size(); i++) {
            System.out.println(lecturers.get(i).toString());
        }

    }

    public static void main(String[] args) throws IOException {
        System.out.println("Nhap so luong can bo: ");
        int n = new Scanner(System.in).nextInt();
        Faculty khoa = new Faculty(n);
        System.out.println("=================== NHAP CAN BO ====================");
        khoa.initFaculty();
        System.out.println("================== HIEN THI CAN BO ==================");
        khoa.display();
        System.out.println("================== TIM KIEM TEN CAN BO =================");
        khoa.searchByName();
        System.out.println("================== GHI FILE CAN BO =================");
        khoa.writeFileListLecture();
        System.out.println("================== DOC FILE CAN BO =================");
        khoa.readFileListLecture();


    }
}
