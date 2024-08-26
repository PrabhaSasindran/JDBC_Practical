package ExceptionPack;

public class NullpointerExcepExample {
    public static void main(String[] args){
        System.out.println("main start");
        String str = null;
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            e.printStackTrace();
           // System.out.println(e +"handled");
        }
        System.out.println("main end");
    }
}
