package Bai2;

import java.util.Scanner;

public class Lecturer extends Person {
    private String lecId;

    public Lecturer() {
    }

    public Lecturer(String name, String address, String lecId) {
        super(name, address);
        this.lecId = lecId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLecId() {
        return lecId;
    }

    public void setLecId(String lecId) {
        this.lecId = lecId;
    }

    @Override
    public void inputData() {
        super.inputData();
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap lecId: ");
        lecId = nhapDL.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\t" + lecId);
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + lecId;
    }
}
