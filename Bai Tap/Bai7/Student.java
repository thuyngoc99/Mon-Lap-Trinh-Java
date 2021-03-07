package Bai7;

import java.util.Scanner;

public class Students{
    private String firstName;
    private String lastName;
    private Address homeAddress;
    private Address schoolAddress;

    public Students() {
    }

    public Students(String firstName, String lastName, Address homeAddress, Address schoolAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(Address schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    @Override
    public String toString() {
        return firstName + " - " + lastName + " - " + homeAddress + " - " + schoolAddress;
    }

    public void nhapsinhvien(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap firstName: ");
        firstName = nhap.nextLine();
        System.out.println("Nhap lastName: ");
        lastName = nhap.nextLine();
        System.out.println("Nhap Home address: ");
        homeAddress = new Address();
        homeAddress.nhap();
        System.out.println("Nhap School Address: ");
        schoolAddress = new Address();
        schoolAddress.nhap();

    }
}

