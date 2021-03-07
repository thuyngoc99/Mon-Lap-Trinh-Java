package TTCS;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

public class MainApp {
    public static void main() {
        ManagerFile managerFile;
        ArrayList<UngVien> ungViens = new ArrayList<UngVien>();
        KiemTra kiemTra = new KiemTra();
        try {
            managerFile = new ManagerFile("./TTCS/input.txt", "r");
            ArrayList<String> listData = managerFile.readFile();
            ungViens = kiemTra.kiemTraDuLieu(listData);
            ManagerDatabase.getConnection();
            ManagerDatabase.importUngVien(ungViens);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}