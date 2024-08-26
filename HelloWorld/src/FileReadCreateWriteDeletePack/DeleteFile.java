package FileReadCreateWriteDeletePack;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    public static void main(String[] args){
        try {
            Files.delete(Paths.get("C:\\Prabha\\file1.txt"));
            System.out.println("Deleted");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
