package BT2;

import java.util.Scanner;

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private long zipCode;

    public Address() {
    }

    public Address(String streetAddress, String city, String state, long zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return streetAddress + " - " + city + " - " + state + " - " + zipCode;
    }

    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap dia chi:");
        streetAddress = nhap.nextLine();
        System.out.println("Nhap thanh pho:");
        city = nhap.nextLine();
        System.out.println("Nhap ga:");
        state = nhap.nextLine();
        System.out.println("Nhap ma zip:");
        zipCode = nhap.nextLong();
    }

}
