package Bai1;

import java.util.Scanner;

public class CustomerInfo {
    private String customerName;
    private String customerAdd;

    public CustomerInfo() {
    }

    public CustomerInfo(String customerName, String customerAdd) {
        this.customerName = customerName;
        this.customerAdd = customerAdd;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAdd() {
        return customerAdd;
    }

    public void setCustomerAdd(String customerAdd) {
        this.customerAdd = customerAdd;
    }

    public void nhap(){
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap customerName: ");
        customerName = nhapDL.nextLine();
        System.out.println("Nhap customerAdd: ");
        customerAdd = nhapDL.nextLine();
    }

    @Override
    public String toString() {
        return customerName + "\t" + customerAdd;
    }

    public void display() {
        System.out.println(customerName + "\t" + customerAdd);
    }
}
