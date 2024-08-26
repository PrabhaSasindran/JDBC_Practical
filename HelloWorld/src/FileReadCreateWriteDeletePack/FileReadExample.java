package FileReadCreateWriteDeletePack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Prabha\\sample.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        System.out.println("read successfully");
    }
}
