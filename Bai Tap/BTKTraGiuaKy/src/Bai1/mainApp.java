package Bai1;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class mainApp {

    private BankAccount[] accounts;
    private ManagerFile mf;

    public void initBank(){
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap so luong tai khoan: ");
        int n = nhapDL.nextInt();
        accounts = new BankAccount[n];
        for (int i = 0; i < accounts.length; i++){
            System.out.println("Tai khoan thu " + (i + 1));
            accounts[i] = new BankAccount();
            accounts[i].nhap();
        }
    }

    public void display(){
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].toString());
        }
    }

    public BankAccount[] hien(){
        return accounts;
    }

    public void withDrawSimulation(int stk, float tienrut){
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNo() == stk){
                if (accounts[i].doWithDraw(tienrut)){
                    System.out.println("Rut thanh cong");
                }
            }
        }
    }

    public void depositSimulation(int stk, float tienchuyen){
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNo() == stk){
                accounts[i].doDeposit(tienchuyen);
                System.out.println("Ban da gui tien");
            }
        }
    }

    public void transferSimulation(int tkchuyen, int tknhan, float tien){
        BankAccount chuyen = new BankAccount();
        BankAccount nhan = new BankAccount();
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNo() == tkchuyen){
                chuyen = accounts[i];
            }
            if (accounts[i].getAccountNo() == tknhan){
                nhan = accounts[i];
            }
        }
        chuyen.transferMoney(nhan, tien);
    }

//    public void writeFileBank() throws IOException {
//        mf = new ManagerFile();
//        for (int i = 0; i < accounts.length; i++) {
//            mf.writeFile(accounts[i].toString());
//        }
//    }
//
//    public void readFileBank() throws IOException {
//        mf = new ManagerFile();
//        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
//        String line;
//        while ((line = mf.readFile()) != null){
//            String[] bc = line.split("\t");
//            String name = bc[0];
//            String add = bc[1];
//            int numberAcc = Integer.parseInt(bc[2]);
//            float accountBalance = Float.parseFloat(bc[3]);
//            BankAccount bank = new BankAccount(name, add, numberAcc, accountBalance);
//            bankAccounts.add(bank);
//        }
//        for (int i = 0; i < bankAccounts.size(); i++) {
//            System.out.println(bankAccounts.get(i).toString());
//        }
//    }

    public static void main(String[] args) throws IOException {
        mainApp app = new mainApp();
        System.out.println("=============== NHAP TAI KHOAN NGAN HANG ===================");
        app.initBank();
        System.out.println("=============== HIEN TAI KHOAN NGAN HANG ===================");
        app.display();
        System.out.println("=============== CAC PHUONG THUC =====================");
        Scanner nhapDL = new Scanner(System.in);

        System.out.println("Nhap so tai khoan can nap: ");
        int tk1 = nhapDL.nextInt();
        System.out.println("Nhap so tien can nap");
        int tienchuyen = nhapDL.nextInt();
        app.depositSimulation(tk1, tienchuyen);

        System.out.println("Nhap so tai khoan can rut: ");
        int tk2 = nhapDL.nextInt();
        System.out.println("Nhap so tien can rut");
        int tienrut = nhapDL.nextInt();
        app.withDrawSimulation(tk2, tienrut);

        System.out.println("Nhap so tai khoan can chuyen: ");
        int a = nhapDL.nextInt();
        System.out.println("Nhap so tai khoan can rut: ");
        int b = nhapDL.nextInt();
        System.out.println("Nhap so tien:");
        float tien = nhapDL.nextInt();
        app.transferSimulation(a,b,tien);

    }
}
