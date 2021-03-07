package Bai2;

import java.util.Scanner;

public abstract class Person {
    public String name;
    public String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void inputData(){
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = nhapDL.nextLine();
        System.out.println("Nhap dia chi: ");
        address = nhapDL.nextLine();
    }

    public void display(){
        System.out.println(name + "\t" + address);
    }

    @Override
    public String toString() {
        return name + "\t" + address;
    }
}
