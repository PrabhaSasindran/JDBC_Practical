package ExceptionPackOne;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTypeFirstExample {
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("C:\\Prabha\\sample.txt");
        } catch(Exception e){
            e.printStackTrace();
        }
//        catch (NumberFormatException e){
//            e.printStackTrace();
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }
    }
}
