package Bai2;

import java.io.*;

public class ManagerFile {
    private File file1, file2;
    private RandomAccessFile raf1, raf2;
    public ManagerFile() throws IOException {
        file1 = new File("./src/Bai2/fileLecturee.txt");
        if (!file1.exists()){
            file1.createNewFile();
        }
        file2 = new File("./src/Bai2/fileStudent.txt");
        if (!file2.exists()){
            file2.createNewFile();
        }
        raf1 = new RandomAccessFile(file1, "rw");
        raf2 = new RandomAccessFile(file2, "rw");
    }

    public void writeFileLecturer(String object) throws IOException {
        raf1.seek(raf1.length());
        raf1.writeBytes(object + "\n");
    }

    public void writeStudent(String object) throws IOException {
        raf2.seek(raf2.length());
        raf2.writeBytes(object + "\n");
    }

    public String readFileLecturer() throws IOException {
        String line="";
        return line = raf1.readLine();
    }

    public String readFileStudent() throws IOException {
        String line="";
        return line = raf2.readLine();
    }
}
