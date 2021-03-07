package Bai3;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class faculty1 extends University{
    private String faculityID;
    private String faculityName;
    Scanner nhap = new Scanner(System.in);
    Hashtable<String, Lecturer> dsCanBo;

    public faculty1() {
    }

    public faculty1(String uniName, String uniAddress, String faculityID, String faculityName, Hashtable<String, Lecturer> dsCanBo) {
        super(uniName, uniAddress);
        this.faculityID = faculityID;
        this.faculityName = faculityName;
        this.dsCanBo = dsCanBo;
    }

    public void initFaculity(){
        dsCanBo = new Hashtable<>();
        System.out.println("Nhap so can bo: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Can bo thu " + (i + 1));
            super.inputData();
            System.out.println("Nhap ma khoa: ");
            faculityID = nhap.nextLine();;
            System.out.println("Nhap ten khoa: ");
            faculityName = nhap.nextLine();
            Lecturer khoa = new Lecturer();
            khoa.inputData();
            dsCanBo.put(khoa.getLecId(), khoa);
        }
    }

    public void display(){

//        for (int i = 0; i < dsCanBo.size(); i++) {
//
//            System.out.println(dsCanBo.get(dsCanBo.elements().nextElement()));
//        }
        super.display();
        System.out.print("\t" + faculityID + "\t" + faculityName + "\t");
        Enumeration<String> lect = dsCanBo.keys();
        while (lect.hasMoreElements()){
            System.out.println(dsCanBo.get(lect.nextElement()));
        }
    }

    public ArrayList<Lecturer> searchByName(String name){
        ArrayList<Lecturer> canbo = new ArrayList<>();
        Enumeration<Lecturer> cb = dsCanBo.elements();
        while (cb.hasMoreElements()){
            Lecturer lect = cb.nextElement();
            if (lect.getLecName().contains(name)){
                canbo.add(lect);
            }
        }
        return canbo;

    }

    public static void main(String[] args) {
        faculty1 khoa = new faculty1();
        khoa.initFaculity();
        khoa.display();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ten can tim: ");
        String name = nhap.nextLine();
        if (khoa.searchByName(name).isEmpty()){
            System.out.println("Khong tim thay");
        }
        else {
            for (int i = 0; i < khoa.searchByName(name).size(); i++) {
                System.out.println(khoa.searchByName(name).get(i).toString());
            }
        }
    }
}
