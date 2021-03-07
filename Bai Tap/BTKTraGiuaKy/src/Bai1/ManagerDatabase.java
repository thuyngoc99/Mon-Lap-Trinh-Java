package Bai1;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ManagerDatabase {
    private static Connection conn;

    public static void getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DataBaseName=Bank", "sa", "123456");
        if (conn != null){
            System.out.println("Ket noi thanh cong");
        }
        else {
            System.out.println("Ket noi that bai");
        }
    }

    public static void importDB(BankAccount[] bankAccounts) throws SQLException {
        int value = 0;
        PreparedStatement st;
        for (int i = 0; i < bankAccounts.length; i++) {
            String sql = "insert into CustomerInfo values('"+bankAccounts[i].getCustomerName()+"', '"+bankAccounts[i].getCustomerAdd()+"')";
            st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()){
                int key = rs.getInt(1);
                String sqlBank = "insert into BankAccount(CustomerID, AccountNo, AccountBalance) values ('"+key+"', '"+bankAccounts[i].getAccountNo()+"', '"+bankAccounts[i].getAccountBalance()+"')";
                st = conn.prepareStatement(sqlBank);
                value = st.executeUpdate();
            }
        }
        if (value > 0){
            System.out.println("Them thanh cong");
        }
        else {
            System.out.println("Them that bai");
        }
    }

    public static ArrayList<BankAccount> export() throws SQLException {
//        BankAccount[] bankAccounts = new BankAccount[10];
//        ArrayList<BankAccount> bank = new ArrayList<>(Arrays.asList(bankAccounts));
        ArrayList<BankAccount> bankAccounts1 = new ArrayList<>();
        String sql = "select CustomerName, CustomerAdd, AccountNo, AccountBalance from BankAccount b inner join CustomerInfo c on b.CustomerID = c.CustomerID ";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()){
                String cusName = rs.getString(1);
                String cusAdd = rs.getString(2);
                int AccountNo = rs.getInt(3);
                float AccountBalance = rs.getFloat(4);
                BankAccount bankAccount = new BankAccount(cusName,cusAdd, AccountNo, AccountBalance);
                bankAccounts1.add(bankAccount);
        }

        for (int i = 0; i < bankAccounts1.size(); i++) {
            System.out.println(bankAccounts1.get(i).toString());
        }
        return bankAccounts1;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        getConnection();
        mainApp mainApp = new mainApp();
//        mainApp.initBank();
//        importDB(mainApp.hien());
        System.out.println(export());
    }
}
