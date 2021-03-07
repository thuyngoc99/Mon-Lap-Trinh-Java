package De1;

import java.sql.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class DB_Array {
    private static Connection conn;

    public static void getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; dataBaseName = taiLieu", "sa", "123456");
        if (conn != null){
            System.out.println("Ket noi thanh cong");
        }
        else {
            System.out.println("Ket noi that bai");
        }
    }

    public static void importDB_Array(TaiLieu[] taiLieus) throws SQLException {
        PreparedStatement st;
        for (TaiLieu taiLieu: taiLieus) {
            String sql = "insert into TaiLieu(MaTaiLieu, TenNhaXB, SoBanPhatHanh) values('"+taiLieu.getMaTaiLieu()+ "', '"+taiLieu.getTenNhaXuatBan()+"', '"+taiLieu.getSoBanPhatHanh()+"') ";
            st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()){
                if (taiLieu instanceof Sach){
                    String sql_Sach = "insert into Sach(TenTacGia, SoTrang, MaTaiLieu) values('"+((Sach) taiLieu).getTenTacGia()+"', '"+((Sach) taiLieu).getSoTrang()+"', '"+taiLieu.getMaTaiLieu()+"')";
                    st = conn.prepareStatement(sql_Sach);
                    st.executeUpdate();
                }
                else if (taiLieu instanceof TapChi){
                    String sql_Tapchi = "insert into TapChi(SoPhatHanh, ThangPhatHanh, MaTaiLieu) values ('"+((TapChi) taiLieu).getSoPhatHanh()+"', '"+((TapChi) taiLieu).getThangPhatHanh()+"', '"+taiLieu.getMaTaiLieu()+"')";
                    st = conn.prepareStatement(sql_Tapchi);
                    st.executeUpdate();
                }
                else if (taiLieu instanceof Bao){
                    String sql_Bao = "insert into Bao(NgayPhatHanh, MaTaiLieu) values ('"+((Bao) taiLieu).getNgayPhatHanh()+"', '"+taiLieu.getMaTaiLieu()+"')";
                    st = conn.prepareStatement(sql_Bao);
                    st.executeUpdate();
                }
            }
        }
        System.out.println("Them thanh cong");
    }

    public static void importDB_Hashtable(Hashtable<String, TaiLieu> taiLieus) throws SQLException {
        PreparedStatement st;
        Enumeration<TaiLieu> en = taiLieus.elements();
        while (en.hasMoreElements()){
            TaiLieu taiLieu = en.nextElement();
            String sql = "insert into TaiLieu(MaTaiLieu, TenNhaXB, SoBanPhatHanh) values('"+taiLieu.getMaTaiLieu()+ "', '"+taiLieu.getTenNhaXuatBan()+"', '"+taiLieu.getSoBanPhatHanh()+"') ";
            st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()){
                if (taiLieu instanceof Sach){
                    String sql_Sach = "insert into Sach(TenTacGia, SoTrang, MaTaiLieu) values('"+((Sach) taiLieu).getTenTacGia()+"', '"+((Sach) taiLieu).getSoTrang()+"', '"+taiLieu.getMaTaiLieu()+"')";
                    st = conn.prepareStatement(sql_Sach);
                    st.executeUpdate();
                }
                else if (taiLieu instanceof TapChi){
                    String sql_Tapchi = "insert into TapChi(SoPhatHanh, ThangPhatHanh, MaTaiLieu) values ('"+((TapChi) taiLieu).getSoPhatHanh()+"', '"+((TapChi) taiLieu).getThangPhatHanh()+"', '"+taiLieu.getMaTaiLieu()+"')";
                    st = conn.prepareStatement(sql_Tapchi);
                    st.executeUpdate();
                }
                else if (taiLieu instanceof Bao){
                    String sql_Bao = "insert into Bao(NgayPhatHanh, MaTaiLieu) values ('"+((Bao) taiLieu).getNgayPhatHanh()+"', '"+taiLieu.getMaTaiLieu()+"')";
                    st = conn.prepareStatement(sql_Bao);
                    st.executeUpdate();
                }
            }
        }
        System.out.println("Them thanh cong");
    }

    public static ArrayList<TaiLieu> exportDB_SachArrayList() throws SQLException {
        ArrayList<TaiLieu> tl = new ArrayList<>();
        Statement st = conn.createStatement();
        String sql_sach = "Select tl.MaTaiLieu, TenNhaXB, SoBanPhatHanh, TenTacGia, SoTrang from TaiLieu tl inner join Sach s on tl.MaTaiLieu = s.MaTaiLieu";
        ResultSet rs = st.executeQuery(sql_sach);

        while (rs.next()){
            TaiLieu sach = new Sach(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5));
            tl.add(sach);
        }

        for (int i = 0; i < tl.size(); i++) {
            System.out.println(tl.get(i).toString());
        }
        return tl;
    }

    public static Hashtable<String, TaiLieu> exportDB_SachHashTable() throws SQLException {
        Hashtable<String, TaiLieu> tl = new Hashtable<>();
        Statement st = conn.createStatement();
        String sql_sach = "Select tl.MaTaiLieu, TenNhaXB, SoBanPhatHanh, TenTacGia, SoTrang from TaiLieu tl inner join Sach s on tl.MaTaiLieu = s.MaTaiLieu";
        ResultSet rs = st.executeQuery(sql_sach);

        while (rs.next()){
            TaiLieu sach = new Sach(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5));
            tl.put(sach.getMaTaiLieu(), sach);
        }
        Enumeration<TaiLieu> en = tl.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        return tl;
    }

    public static ArrayList<TaiLieu> exportDB_TapChi() throws SQLException {
        ArrayList<TaiLieu> tl = new ArrayList<>();
        Statement st = conn.createStatement();
        String sql_TapChi = "Select tl.MaTaiLieu, TenNhaXB, SoBanPhatHanh, SoPhatHanh, ThangPhatHanh from TaiLieu tl inner join TapChi tc on tl.MaTaiLieu = tc.MaTaiLieu";
        ResultSet rs = st.executeQuery(sql_TapChi);

        while (rs.next()){
            TaiLieu tapchi = new TapChi(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
            tl.add(tapchi);
        }

        for (int i = 0; i < tl.size(); i++) {
            System.out.println(tl.get(i).toString());
        }
        return tl;
    }

    public static ArrayList<TaiLieu> exportDB_Bao() throws SQLException {
        ArrayList<TaiLieu> tl = new ArrayList<>();
        Statement st = conn.createStatement();
        String sql_bao = "Select tl.MaTaiLieu, TenNhaXB, SoBanPhatHanh, NgayPhatHanh from TaiLieu tl inner join Bao b on tl.MaTaiLieu = b.MaTaiLieu";
        ResultSet rs = st.executeQuery(sql_bao);

        while (rs.next()){
            TaiLieu bao = new Bao(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4));
            tl.add(bao);
        }

        for (int i = 0; i < tl.size(); i++) {
            System.out.println(tl.get(i).toString());
        }
        return tl;

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        getConnection();
        QuanLySach_Array quanLySach_array = new QuanLySach_Array();
//        quanLySach_array.nhapTaiLieu();
//        importDB(quanLySach_array.getTaiLieus());
//        QuanLySach_Hashtable quanLySach_hashtable = new QuanLySach_Hashtable();
//        quanLySach_hashtable.nhapTaiLieu();
//        importDB_Hashtable(quanLySach_hashtable.getTaiLieu());
        exportDB_SachArrayList();
//        exportDB_TapChi();
//        exportDB_Bao();
        exportDB_SachHashTable();
    }
}
