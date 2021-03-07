package BTLon2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class ManagerFile {
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
