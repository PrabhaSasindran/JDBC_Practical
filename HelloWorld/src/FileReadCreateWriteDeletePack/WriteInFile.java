package FileReadCreateWriteDeletePack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteInFile {
    public static void main(String[] args){
        File file = new File("C:\\Prabha\\file2.txt");
        if (!(file.exists())){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello");
            pw.println(100);
            pw.close();
            System.out.println("Writing done");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
