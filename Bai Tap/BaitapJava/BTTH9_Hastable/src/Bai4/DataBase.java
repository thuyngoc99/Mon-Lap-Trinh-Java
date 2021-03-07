package Bai4;

import javafx.beans.binding.When;

import java.sql.*;
import java.util.Enumeration;
import java.util.Hashtable;

public class DataBase {
    private static Connection conn;

    private static void getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DataBaseName = ThiSinh", "sa", "123456");
        if(conn != null){
            System.out.println("Ket noi thanh cong");
        }
        else {
            System.out.println("Ket noi that bai");
        }
    }

    private static void import_DB(Hashtable<String, ThiSinh> thiSinh) throws SQLException {
        PreparedStatement st;
        Enumeration<ThiSinh> en = thiSinh.elements();
        while (en.hasMoreElements()){
            ThiSinh thisinh = en.nextElement();
            String sql = "insert into ThiSinh(SoBaoDanh, HoTen, DiaChi, UuTien) values ('"+thisinh.getSoBaoDanh()+"', '"+thisinh.getHoTen()+"', '"+thisinh.getDiaChi()+"', '"+thisinh.getUuTien()+"')";
            st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()){
                if (thisinh instanceof ThiSinhKhoiA){
                    String sql_KhoiA = "insert into ThiSinhKhoiA(SoBaoDanh) values ('"+thisinh.getSoBaoDanh()+"')";
                    st = conn.prepareStatement(sql_KhoiA);
                    st.executeUpdate();
                }
                else if (thisinh instanceof ThiSinhKhoiB){
                    String sql_KhoiB = "insert into ThiSinhKhoiB(SoBaoDanh) values ('"+thisinh.getSoBaoDanh()+"')";
                    st = conn.prepareStatement(sql_KhoiB);
                    st.executeUpdate();
                }
                else if (thisinh instanceof ThiSinhKhoiC){
                    String sql_KhoiC = "insert into ThiSinhKhoiC(SoBaoDanh) values ('"+thisinh.getSoBaoDanh()+"')";
                    st = conn.prepareStatement(sql_KhoiC);
                    st.executeUpdate();
                }

            }

        }
        System.out.println("Them thanh cong");

    }

    public static Hashtable<String, ThiSinh> export_TSKhoiA() throws SQLException {
        Hashtable<String, ThiSinh> ListthiSinh = new Hashtable<>();
        String sql_TSKhoiA = "Select tskhoiA.SoBaoDanh, HoTen, DiaChi, UuTien from ThiSinh ts inner join ThiSinhKhoiA tskhoiA on ts.SoBaoDanh = tskhoiA.SoBaoDanh ";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql_TSKhoiA);
        while (rs.next()){
            ThiSinhKhoiA thiSinhA = new ThiSinhKhoiA(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            ListthiSinh.put(thiSinhA.getSoBaoDanh(), thiSinhA);
        }
        Enumeration<ThiSinh> en = ListthiSinh.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        return ListthiSinh;
    }

    public static Hashtable<String, ThiSinh> export_TSKhoiB() throws SQLException {
        Hashtable<String, ThiSinh> ListthiSinh = new Hashtable<>();
        Statement st = conn.createStatement();
        String sql_TSKhoiA = "Select ts.SoBaoDanh, HoTen, DiaChi, UuTien from ThiSinh ts inner join ThiSinhKhoiB tskhoiB on tskhoiB.SoBaoDanh = ts.SoBaoDanh ";
        ResultSet rs = st.executeQuery(sql_TSKhoiA);
        while (rs.next()){
            ThiSinhKhoiB thiSinhB = new ThiSinhKhoiB(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            ListthiSinh.put(thiSinhB.getSoBaoDanh(), thiSinhB);
        }
        Enumeration<ThiSinh> en = ListthiSinh.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        return ListthiSinh;
    }

    public static Hashtable<String, ThiSinh> export_TSKhoiC() throws SQLException {
        Hashtable<String, ThiSinh> ListthiSinh = new Hashtable<>();
        String sql_TSKhoiA = "Select ts.SoBaoDanh, HoTen, DiaChi, UuTien from ThiSinh ts inner join ThiSinhKhoiC tskhoiC on ts.SoBaoDanh = tskhoiC.SoBaoDanh ";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql_TSKhoiA);
        while (rs.next()){
            ThiSinhKhoiC thiSinhC = new ThiSinhKhoiC(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            ListthiSinh.put(thiSinhC.getSoBaoDanh(), thiSinhC);
        }
        Enumeration<ThiSinh> en = ListthiSinh.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        return ListthiSinh;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        getConnection();
        TuyenSinh tuyenSinh = new TuyenSinh();
//        tuyenSinh.nhapThiSinh();
//        import_DB(tuyenSinh.getThiSinhs());
        export_TSKhoiA();
        export_TSKhoiB();
        export_TSKhoiC();
    }
}
