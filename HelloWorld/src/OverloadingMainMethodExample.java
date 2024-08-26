public class OverloadingMainMethodExample {
    public static void main(String[] args){
     System.out.println("main method");
     main(100f);
     main(10);
    }
    public static void main(int a){
        System.out.println("overloading using integer  "+a);
    }

    public static void main(float a){
        System.out.println("overloading using float  "+a);
    }
}
