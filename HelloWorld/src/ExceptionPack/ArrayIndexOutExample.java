package ExceptionPack;

public class ArrayIndexOutExample {
    public static void main(String[] args){
        System.out.println("main start");
        int[] a = {1,4,5,6,2};
        try {
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
           e.printStackTrace();
            //System.out.println("handled");
        }
        System.out.println("main end");
    }
}
