package TTCS;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerFile {
    private File file, file1;
    private RandomAccessFile of, off;

    public ManagerFile() throws IOException {
        file = new File("./TTCS/input.txt");
        if (!file.exists()) {file.createNewFile();}
        of = new RandomAccessFile(file, "rw");

        file1 = new File("./TTCS/input1.txt");
        if (!file1.exists()) {file1.createNewFile();}
        off = new RandomAccessFile(file1, "rw");
    }

    public void writeFile1(String ungVien) throws IOException {
        off.seek(off.length());
        off.writeBytes(ungVien);
    }

    public String readFilee() throws IOException {
        String line = " ";
        return line = of.readLine();
    }

    private RandomAccessFile rf;

    public ManagerFile(String pathFile, String mode) throws FileNotFoundException {
        this.rf = new RandomAccessFile(new File(pathFile), mode);
    }


    public void writeFile(List<String> errorList) {
        try {
            rf.seek(rf.length());
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        for(String errorItem : errorList) {
            try {
                rf.writeBytes(errorItem+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<String> readFile() throws IOException {
        ArrayList<String> data = new ArrayList<String>();
        String line = rf.readLine();
        while(line != null) {
            data.add(line.trim());
            line = rf.readLine();
        }
        return data;
    }
}
