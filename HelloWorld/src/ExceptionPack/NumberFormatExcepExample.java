package ExceptionPack;

public class NumberFormatExcepExample {
    public static void main(String[] args){
        System.out.println("main start");
        String str = "10.0";
        int a=0;
        try {
             a = Integer.parseInt(str);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        System.out.println(a);
        System.out.println("main end");
    }
}
