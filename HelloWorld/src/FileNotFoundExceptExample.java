import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptExample {
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("C:\\Prabha\\sample.txt");
            System.out.println("read successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
