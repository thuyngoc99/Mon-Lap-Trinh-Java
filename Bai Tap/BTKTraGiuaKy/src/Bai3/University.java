package Bai3;

import java.util.Scanner;

public class University {
    public String uniName;
    public String uniAddress;

    public University() {
    }

    public University(String uniName, String uniAddress) {
        this.uniName = uniName;
        this.uniAddress = uniAddress;
    }

    public void inputData(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap uniName:");
        uniName = nhap.nextLine();
        System.out.println("Nhap uniAddress: ");
        uniAddress = nhap.nextLine();
    }

    public void display(){
        System.out.println(uniName + "\t" + uniAddress + "\t");
    }

    @Override
    public String toString() {
        return uniName + "\t" + uniAddress + "\t";
    }
}
