package packExample;

public class pack {
    public static void main(String[] args){
        A.m1();
        System.out.println(A.i+" package variable");
        B.m1();
    }
}

class A{
    static int i =10;
    static void m1(){
        System.out.println("package packExample");
    }
}
class B extends A{
    public void m2(){
        B.m1();
    }

}