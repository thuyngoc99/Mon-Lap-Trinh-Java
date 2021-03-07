package Bai2;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ManagerDatabase {
    private static Connection conn;

    public static void getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DataBaseName=QLSinhVienThucTap", "sa", "123456");
        if (conn != null) {
            System.out.println("Ket noi thanh cong");
        } else {
            System.out.println("Ket noi that bai");
        }
    }

    public static void importDB_Student(Student[] students) throws SQLException {
        PreparedStatement st;
        int value = 0;
        for (Person student : students) {
            String sql = "insert into Person values('"+student.name+"', '"+student.address+"')";
            st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            value = st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();

            while (rs.next()){
                int key = rs.getInt(1);
                if (student instanceof Student){
                    String sql1 = "insert into Student(StudentID, lecID, topicTitle, grade, PersonID) values ('"+((Student) student).getStudentId()+"', '"+((Student) student).getLecId()+"', '"+((Student) student).getTopicTitle()+"', '"+((Student) student).getGrade()+"', '"+key+"')";
                    st = conn.prepareStatement(sql1);
                    value = st.executeUpdate();
                }
            }
        }
        if (value > 0){
            System.out.println("Them thanh cong");
        }
        else {
            System.out.println("Them that bai");
        }
    }

    public static void importDB_Lecturer(Lecturer[] lecturerArrayList) throws SQLException {
        PreparedStatement st;
        int value = 0;
        for (Person lecturer : lecturerArrayList) {
            String sql = "insert into Person values('"+lecturer.name+"', '"+lecturer.address+"')";
            st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            value = st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();

            while (rs.next()){
                int key = rs.getInt(1);
                if(lecturer instanceof Lecturer){
                    String sql2 = "insert into Lecturer(LecID, PersonID) values('"+((Lecturer) lecturer).getLecId()+"', '"+key+"')";
                    st = conn.prepareStatement(sql2);
                    value = st.executeUpdate();
                }
            }
        }
        if (value > 0){
            System.out.println("Them thanh cong");
        }
        else {
            System.out.println("Them that bai");
        }
    }

    public static ArrayList<Student> export_Student() throws SQLException {
        ArrayList<Student> students = new ArrayList<>();
        String sql = "select Name, Address, StudentID, LecID, topicTitle, grade from Person p inner join Student s on p.PersonID = s.PersonID";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
            Student sinhvien = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getFloat(6));
            students.add(sinhvien);
        }
        for (Student sv : students) {
            System.out.println(sv.toString());
        }
        return students;
    }

    public static ArrayList<Lecturer> export_Lecturer() throws SQLException {
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        String sql = "select Name, Address, LecID  from Person p inner join Lecturer s on p.PersonID = s.PersonID";
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            Lecturer lecturer = new Lecturer(rs.getString(1), rs.getString(2), rs.getString(3));
            lecturers.add(lecturer);
        }
        for (Lecturer lc : lecturers) {
            System.out.println(lc.toString());
        }
        return lecturers;
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        getConnection();
        MainApp mainApp = new MainApp();
//        System.out.println("Them vao bang student");
//        mainApp.initStudents();
//        importDB_Student(mainApp.getStudentList());
//        System.out.println("Them vao bang lecturer");
//        mainApp.initLecturers();
//        importDB_Lecturer(mainApp.getLecturerList());
        System.out.println("========= Bang lecturer ===========");
        export_Lecturer();
        System.out.println("========= Bang student ============");
        export_Student();
    }
}
