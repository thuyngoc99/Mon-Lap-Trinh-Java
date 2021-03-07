package Bai1;

import java.util.Scanner;

public class BankAccount extends CustomerInfo {
    private int accountNo;
    private float accountBalance; //so du tai khoan
    private float withdrawNum; //so tien rut
    private float depositNum;  //so tien gui
    private float accountInterest; //so tien lai trong tai khoan
    Scanner nhapDL = new Scanner(System.in);

    public BankAccount() {
    }

    public BankAccount(String customerName, String customerAdd, int accountNo, float accountBalance) {
        super(customerName, customerAdd);
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String customerName, String customerAdd, int accountNo, float accountBalance, float withdrawNum, float depositNum, float accountInterest) {
        super(customerName, customerAdd);
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
        this.withdrawNum = withdrawNum;
        this.depositNum = depositNum;
        this.accountInterest = accountInterest;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public float getWithdrawNum() {
        return withdrawNum;
    }

    public void setWithdrawNum(float withdrawNum) {
        this.withdrawNum = withdrawNum;
    }

    public float getDepositNum() {
        return depositNum;
    }

    public void setDepositNum(float depositNum) {
        this.depositNum = depositNum;
    }

    public float getAccountInterest() {
        return accountInterest;
    }

    public void setAccountInterest(float accountInterest) {
        this.accountInterest = accountInterest;
    }

    public boolean doWithDraw(float withdrawNum ){
        if (accountBalance >= withdrawNum){
            accountBalance -= withdrawNum;
            System.out.println("So tien trong tai khoan sau khi rut con lai la: " + accountBalance);
            return true;
        }
        else {
            return false;
        }
    }

    public void doDeposit(float depositNum){
        if (depositNum > 0){
            accountBalance += depositNum;
            System.out.println("So tien gui them la: " + depositNum);
            System.out.println("So tien trong tai khoan sau khi gui them la:" + accountBalance);
        }
    }

    public void computeMonthInterest(){
        System.out.println("Nhap accountInterest: ");
        accountInterest = nhapDL.nextFloat();
        BankPolicy policy = new BankPolicy();
        accountBalance += accountInterest * (policy.getInterRate()/12);
        System.out.println("Lai suat theo thang: " + accountBalance);
    }

    public void transferMoney(BankAccount a, float tienchuyen){
        if (doWithDraw(tienchuyen)){
            System.out.println("Chuyen thanh cong");
            a.doDeposit(tienchuyen);
        }
        else {
            System.out.println("Khong du tien chuyen");
        }
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner nhapDL = new Scanner(System.in);
        System.out.println("Nhap accountNo: ");
        accountNo = nhapDL.nextInt();
        System.out.println("Nhap accountBalance: ");
        accountBalance = nhapDL.nextFloat();
//        System.out.println("Nhap withdrawNum: ");
//        withdrawNum = nhapDL.nextFloat();
//        System.out.println("Nhap depositNum: ");
//        depositNum = nhapDL.nextFloat();
//        System.out.println("Nhap accountInterest: ");
//        accountInterest = nhapDL.nextFloat();
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + accountNo + "\t" + accountBalance ;
    }

    public void display() {
        super.display();
        System.out.println("\t" + accountNo + "\t" + accountBalance);
    }
}
