package Bai2;

import java.sql.*;
import java.util.Enumeration;
import java.util.Hashtable;

public class DataBase {
    private static Connection conn;

    public static void getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DataBaseName = CanBo", "sa", "123456");
        if (conn != null){
            System.out.println("Ket noi thanh cong");
        }
        else {
            System.out.println("Ket noi that bai");
        }
    }

    public static void importDB(Hashtable<String, CanBo> canBo) throws SQLException {
        PreparedStatement st;
        Enumeration<CanBo> en = canBo.elements();
        while (en.hasMoreElements()) {
            CanBo canbo = en.nextElement();
            String sql = "insert into CanBo(MaCB, HoTen, NamSinh, GioiTinh, DiaChi) values ('"+canbo.getId()+ "', '"+canbo.getHoTen()+"', '"+canbo.getNamSinh()+"', '"+canbo.getGioiTinh()+"', '"+canbo.getDiaChi()+"')";
            st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()) {
                if (canbo instanceof CongNhan) {
                    String sql_CN = "insert into CongNhan(Bac, MaCB) values ('" + ((CongNhan) canbo).getBac() + "', '" + canbo.getId() + "')";
                    st = conn.prepareStatement(sql_CN);
                    st.executeUpdate();
                } else if (canbo instanceof KySu) {
                    String sql_KS = "insert into KySu(NganhDaoTao, MaCB) values ('" + ((KySu) canbo).getNganhDaoTao() + "', '" + canbo.getId() + "')";
                    st = conn.prepareStatement(sql_KS);
                    st.executeUpdate();
                } else if (canbo instanceof NhanVien) {
                    String sql_NV = "insert into NhanVien(CongViec, MaCB) values ('" + ((NhanVien) canbo).getCongViec() + "', '" + canbo.getId() + "')";
                    st = conn.prepareStatement(sql_NV);
                    st.executeUpdate();
                }
            }
        }
        System.out.println("Them thanh cong");
    }

    public static Hashtable<String, CanBo> exportDB_CN() throws SQLException {
        Hashtable<String, CanBo> CB = new Hashtable<>();
        String sql = "Select cb.MaCB, HoTen, NamSinh, GioiTinh, DiaChi, Bac from CanBo cb inner join CongNhan cn on cb.MaCB = cn.MaCB";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
            CongNhan congNhan = new CongNhan(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6));
            CB.put(congNhan.getId(), congNhan);
        }
        Enumeration<CanBo> en = CB.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        return CB;
    }

    public static Hashtable<String, CanBo> exportDB_KS() throws SQLException {
        Hashtable<String, CanBo> CB = new Hashtable<>();
        String sql = "Select cb.MaCB, HoTen, NamSinh, GioiTinh, DiaChi, NganhDaoTao from CanBo cb inner join KySu ks on cb.MaCB = ks.MaCB";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
            KySu kySu = new KySu(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6));
            CB.put(kySu.getId(), kySu);
        }
        Enumeration<CanBo> en = CB.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        return CB;
    }

    public static Hashtable<String, CanBo> exportDB_NV() throws SQLException {
        Hashtable<String, CanBo> CB = new Hashtable<>();
        String sql_NV = "Select cb.MaCB, HoTen, NamSinh, GioiTinh, DiaChi, CongViec from CanBo cb inner join NhanVien nv on cb.MaCB = nv.MaCB";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql_NV);
        while (rs.next()){
            NhanVien nhanVien = new NhanVien(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6));
            CB.put(nhanVien.getId(), nhanVien);
        }
        Enumeration<CanBo> en = CB.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        return CB;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        getConnection();
        QLCB qlcb = new QLCB();
//        qlcb.nhapCanBo();
//        importDB(qlcb.getCanbo());
        exportDB_CN();
        exportDB_KS();
        exportDB_NV();
    }
}
