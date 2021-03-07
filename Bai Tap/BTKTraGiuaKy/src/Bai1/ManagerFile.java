package Bai1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ManagerFile {
    private File file;
    private RandomAccessFile raf;

    public ManagerFile() throws IOException {
        file = new File("./src/Bai1/bank.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        raf = new RandomAccessFile(file, "rw");
    }

    public void writeFile(String bank) throws IOException {
        raf.seek(raf.length());
        raf.writeBytes(bank + "\n");
    }

    public String readFile() throws IOException {
        String line;
        return line = raf.readLine();
    }
}
