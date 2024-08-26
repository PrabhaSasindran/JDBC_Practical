package packExample;

public class AccessProtectedExample {
    protected static void m1(){
        System.out.println("protected");
        AA.sum();
   }
}

class AA{
    protected static void sum(){
        System.out.println("addition");
    }
}