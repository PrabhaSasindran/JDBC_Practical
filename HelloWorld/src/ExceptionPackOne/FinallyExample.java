package ExceptionPackOne;

public class FinallyExample {
    public static void main(String[] args){
        try{
            System.out.println("main start");
            System.out.println(10/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("i will be excuted anyways");
        }
    }
}
