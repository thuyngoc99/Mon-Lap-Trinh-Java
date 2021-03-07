package Bai3;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ManagerDatabase {
    private static Connection conn;

    public static void getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DataBaseName=QLDSCanBo", "sa", "123456");
        if (conn != null) {
            System.out.println("Ket noi thanh cong");
        } else {
            System.out.println("Ket noi that bai");
        }
    }

    public static void importDB(Lecturer[] lecturers) throws SQLException {
        int value = 0;
        PreparedStatement st;
        for (Lecturer lecturer: lecturers) {
            String sql = "insert into Lecturer values('"+lecturer.getLecId()+"', '"+lecturer.getLecName()+"', '"+lecturer.getLecAddress()+"')";
            st = conn.prepareStatement(sql);
            value = st.executeUpdate();
        }
        if (value > 0){
            System.out.println("Them thanh cong");
        }
        else {
            System.out.println("Them that bai");
        }
    }

    public static ArrayList<Lecturer> export() throws SQLException {
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        String sql = "Select * from Lecturer";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()){
            Lecturer lecturer = new Lecturer(rs.getString(1), rs.getString(2), rs.getString(3));
            lecturers.add(lecturer);
        }
        for (int i = 0; i < lecturers.size(); i++) {
            System.out.println(lecturers.get(i).toString());
        }
        return lecturers;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        getConnection();
        Faculty faculty = new Faculty();
//        faculty.nhap();
//        importDB(faculty.getLecturerList());
        System.out.println(export());
    }
}
