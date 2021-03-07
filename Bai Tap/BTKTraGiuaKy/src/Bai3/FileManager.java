package Bai3;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileManager {
    private File file;
    private RandomAccessFile rf;

    public FileManager() throws IOException {
        file = new File("./src/Bai3/Lecture.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        rf = new RandomAccessFile(file, "rw");
    }

    public void writeFile(String lecture) throws IOException {
        rf.seek(rf.length());
        rf.writeBytes(lecture + "\n");
    }

    public String readFile() throws IOException {
        return rf.readLine();
    }
}
