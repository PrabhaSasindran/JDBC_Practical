package FileReadCreateWriteDeletePack;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){
        System.out.println("Creating file ");
        File file = new File("C:\\Prabha\\file1.txt");
        if(!(file.exists())){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
