package BTLon2;

import java.sql.*;
import java.util.ArrayList;

public class ManagerDatabase {
    private static Connection conn;

    public static void getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;Databasename = employee",
                    "sa","123456");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        if (conn != null){
            System.out.println("Ket noi thanh cong");
        }
        else {
            System.out.println("Ket noi that bai");
        }
    }

    public static void importUngVien(ArrayList<UngVien> uv) throws SQLException {
        PreparedStatement preparedStatement;
        try {
            for (UngVien ungVien : uv) {

                String sqlCandidate = "insert into Candidate(HoTen,NgayThangNamSinh,DiaChiThuongTru,QueQuan,SoDienThoai,Email) values('"+ungVien.getHoTen()+"', '"+ungVien.getNgayThangNamSinh()+"', '"+ungVien.getDiaChi()+"', '"+ungVien.getQueQuan()+"','"+ungVien.getSoDT()+"', '"+ungVien.getEmail()+"')";
                preparedStatement = conn.prepareStatement(sqlCandidate, Statement.RETURN_GENERATED_KEYS);
                preparedStatement.executeUpdate();
                ResultSet rt = preparedStatement.getGeneratedKeys();

                if (rt.next()){
                    int iD = rt.getInt(1);
                    if (ungVien instanceof UngVien_CoKinhNghiem){
                        UngVien_CoKinhNghiem ungVienCoKinhNghiem = (UngVien_CoKinhNghiem) ungVien;
                        String sqlUngviencokinhnghiem = "insert into ExperienceCandidate(CandidateId, soNamKinhNghiem, kyNangChuyenMon, noiLamViecGanNhat) values ('"+iD+"', '"+((UngVien_CoKinhNghiem) ungVien).getSoNamKinhNghiem()+"', '"+((UngVien_CoKinhNghiem) ungVien).getKyNangChuyenMon()+"', '"+((UngVien_CoKinhNghiem) ungVien).getNoiLamViecGanNhat()+"')";
                        preparedStatement = conn.prepareStatement(sqlUngviencokinhnghiem);
                        preparedStatement.executeUpdate();
                    }
                    else if (ungVien instanceof UngVien_MoiTotNghiep){
                        UngVien_MoiTotNghiep ungVienMoiTotNghiep = (UngVien_MoiTotNghiep) ungVien;
                        String sqlUngvienmoitotnghiep = "insert into FresherCandidate(CandidateId, thoiDiemTotNghiep, xepLoaiTotNghiep, truongTotNghiep) values ('"+iD+"','"+((UngVien_MoiTotNghiep) ungVien).getThoiDiemTotNghiep()+"', '"+((UngVien_MoiTotNghiep) ungVien).getXepLoaiTotNghiep()+"', '"+((UngVien_MoiTotNghiep) ungVien).getTruongTotNghiep()+"')";
                        preparedStatement = conn.prepareStatement(sqlUngvienmoitotnghiep);
                        preparedStatement.executeUpdate();
                    }
                    else if (ungVien instanceof SinhVienThucTap){
                        SinhVienThucTap sinhVienThucTap = (SinhVienThucTap) ungVien;
                        String sqlSinhvienthuctap = "insert into InternCandidate(CandidateId, chuyenNganhDangHoc, hocKyDangHoc, tenTruongDangHoc, ngayDuKienTotNghiep) values ('"+iD+"','"+((SinhVienThucTap) ungVien).getChuyenNghanhDangHoc()+"', '"+((SinhVienThucTap) ungVien).getHocKyDangHoc()+"', '"+((SinhVienThucTap) ungVien).getTenTruongDangHoc()+"', '"+((SinhVienThucTap) ungVien).getNgayDuKienTotNghiep()+"')";
                        preparedStatement = conn.prepareStatement(sqlSinhvienthuctap);
                        preparedStatement.executeUpdate();
                    }
                }
           }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Da them vao DataBase");
    }
}
