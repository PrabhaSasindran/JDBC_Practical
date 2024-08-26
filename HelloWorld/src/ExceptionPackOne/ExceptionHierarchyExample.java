package ExceptionPackOne;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHierarchyExample {
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("C:\\Prabha\\sample.txt");
            System.out.println("read successfully");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
