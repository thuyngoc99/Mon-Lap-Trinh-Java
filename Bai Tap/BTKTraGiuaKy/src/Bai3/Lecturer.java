package Bai3;

import java.util.Scanner;

public class Lecturer{
    private String lecId;
    private String lecName;
    private String lecAddress;

    public Lecturer() {
    }

    public Lecturer(String lecId, String lecName, String lecAddress) {
        this.lecId = lecId;
        this.lecName = lecName;
        this.lecAddress = lecAddress;
    }

    public String getLecId() {
        return lecId;
    }

    public void setLecId(String lecId) {
        this.lecId = lecId;
    }

    public String getLecName() {
        return lecName;
    }

    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    public String getLecAddress() {
        return lecAddress;
    }

    public void setLecAddress(String lecAddress) {
        this.lecAddress = lecAddress;
    }

    public void inputData(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap lecId:");
        lecId = nhap.nextLine();
        System.out.println("Nhap lecName: ");
        lecName = nhap.nextLine();
        System.out.println("Nhap lecAddress: ");
        lecAddress = nhap.nextLine();
    }

    public void display() {
        System.out.println(lecId + "\t" + lecName + "\t" + lecAddress);
    }

    @Override
    public String toString() {
        return lecId + "\t" + lecName + "\t" + lecAddress;
    }
}
