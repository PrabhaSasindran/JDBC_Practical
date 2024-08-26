public class AccessPrivateExample {
    public static void main(String[] args){
        Example.m2();

    }
}

class Example{
    private static int i = 10;

    private static void m1(){
        System.out.println("hi private");
    }

    public static void m2(){
        m1();
        System.out.println(i+" private");
    }
}