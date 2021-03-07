package BTLon2;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class KiemTra {
    private static final String NONE = "none";

    private boolean validDate(String date) {
        String datePattern = "\\d{4}/\\d{2}/\\d{2}";
        return Pattern.matches(datePattern, date);
    }

    private boolean validEmail(String email) {
        String emailPattern = "^[\\w]+@[\\w]+\\.{1,}[\\w]+$";
        return Pattern.matches(emailPattern, email);
    }

    private boolean validPhone(String phone) {
        return phone.length() >= 7 ? true : false;
    }

    public ArrayList<UngVien> kiemTraDuLieu(ArrayList<String> listData)
            throws NumberFormatException, ParseException, FileNotFoundException {

        ArrayList<UngVien> ungViens = new ArrayList<UngVien>();
        ArrayList<String> error = new ArrayList<String>();

        ManagerFile managerFile = new ManagerFile("./src/BTLon2/output.txt", "rw");

        int row = 1;
        UngVien ungVien = null;

        for (String line : listData) {
            String[] data = line.split(", ");
            if (!validDate(data[2])) {
                error.add("Dong " + row + ": sai dinh dang ngay thang");
            }
            if (!validEmail(data[6])) {
                error.add("Dong " + row + ": sai dinh dang email");
            }
            if (!validPhone(data[5])) {
                error.add("Dong " + row + ": sai dinh dang so dien thoai");
            }

            if (Integer.parseInt(data[0]) == 1) {

                float soNamKinhNghiem = Math.round(Float.parseFloat(data[7]));

                if (soNamKinhNghiem < 0 || soNamKinhNghiem > 100) {
                    error.add("Dong " + row + ": sai dinh dang so nam kinh nghiem");
                }
                if (!data[10].equals(NONE) || !data[11].equals(NONE) || !data[12].equals(NONE) || !data[13].equals(NONE)
                        || !data[14].equals(NONE) || !data[15].equals(NONE) || !data[16].equals(NONE)) {
                    for (int i = 0; i <= 16; i++) {
                        System.out.println("data[" + i + "]= " + data[i]);
                    }
                    error.add("Dong " + row + ": Thua du lieu");
                } else {
                    ungVien = new UngVien_CoKinhNghiem(data[1], data[2], data[3], data[4], data[5], data[6],
                            Float.parseFloat(data[7]), data[8], data[9]);
                }

            } else if (Integer.parseInt(data[0]) == 2) {
                if (!data[7].equals(NONE) || !data[8].equals(NONE) || !data[9].equals(NONE) || !data[13].equals(NONE)
                        || !data[14].equals(NONE) || !data[15].equals(NONE) || !data[16].equals(NONE)) {
                    error.add("Dong " + row + ": Thua du lieu");
                } else {
                    ungVien = new UngVien_MoiTotNghiep(data[1], data[2], data[3], data[4], data[5], data[6],
                            data[10], data[11], data[12]);
                }
            } else if (Integer.parseInt(data[0]) == 3) {
                if (!data[7].equals(NONE) || !data[8].equals(NONE) || !data[9].equals(NONE) || !data[10].equals(NONE)
                        || !data[11].equals(NONE) || !data[12].equals(NONE)) {
                    error.add("Dong " + row + ": Thua du lieu");
                } else {
                    ungVien = new SinhVienThucTap(data[1], data[2], data[3], data[4], data[5], data[6],
                            data[13], data[14], data[15], data[16]);
                }
            }

            if (error.size() > 0) {
                managerFile.writeFile(error);
                error.removeAll(error);
            } else {
                ungViens.add(ungVien);
            }
            row++;
        }
        return ungViens;
    }
}
